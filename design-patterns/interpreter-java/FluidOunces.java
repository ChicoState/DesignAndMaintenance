// FluidOunces is a Terminal Expression
// (concrete implementation of Volume Interpreter)
// FluidOunces is a Terminal expression because it modifies the context and
// returns the result of the interpretation (final step in the interpretation)
import java.util.Vector;

public class FluidOunces implements VolumeInterpreter {

  // constructor
  public FluidOunces() {}

  // The FluidOunces implementation of interpret() converts the list of items
  // with measurement in cups to a list of items with measurement in fluid
  // ounces. Then it returns the context, because we are done interpreting it.
  @Override
  public Vector<String> interpret(VolumeContext context) {
    Vector<String> itemList = context.getList();
    context.convertToFlOz(itemList);
    return context.getList();
  }
}
