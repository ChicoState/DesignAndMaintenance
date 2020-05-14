// driver: holds main class to run the VolumeInterpreter program
// (Interpreter design pattern example)
import java.util.Vector;

public class driver {
  public static void main(String[] args) {
    try {
      driver.run(args);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  // context starts with list of volumes, each with dif type of measurement
  // context is interpreted so that all values have the same form of measurement
  public static void run (String[] args) throws Exception {
    VolumeInterpreter query = new Measurement(new FluidOunces());
    VolumeContext context = new VolumeContext();
    Vector<String> original = context.getList();
    System.out.println("Before interpretation:");
    for(String item : original) {
      System.out.println(item);
    }
    Vector<String> result = query.interpret(context);
    System.out.println("After interpretation:");
    for(String item : result) {
      System.out.println(item);
    }
  }
}
