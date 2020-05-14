// Measurement is a Non-Terminal Expression
// (concrete implementation of Volume Interpreter)
// Measurement is a Non-Terminal (or Composite) expression because it changes
// the state of the context, but the context is still going to be interpreted
// in an additional step (the FluidOunces implementation of VolumeInterpreter)
import java.util.Vector;

public class Measurement implements VolumeInterpreter {
  private FluidOunces fl_oz;

  // constructor
  public Measurement(FluidOunces fl_oz) {
    this.fl_oz = fl_oz;
  }

  // The Measurement implementation of interpret() converts the list of items
  // with an assortment of measurement types to a list of items with the same
  // measurement type (cups). Then it passes the context to FluidOunces for an
  // additional step in the interpretation process.
  @Override
  public Vector<String> interpret(VolumeContext context) {
    Vector<String> itemList = context.getList();
    context.convertToCups(itemList);

    return fl_oz.interpret(context);
  }
}
