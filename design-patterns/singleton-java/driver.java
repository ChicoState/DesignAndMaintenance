// driver: hold main class to run the Inventory program
public class driver {
  // Client can get the Inventory instance and run, or print stack trace
  public static void main(String[] args) {
    try {
      Inventory inventory = Inventory.get_instance();
      driver.run(args);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  // Run quick test of Inventory class member functions
  public static void run (String[] args) throws Exception {
    Inventory inst = Inventory.get_instance();

    System.out.println("Current Number of Items in Inventory:");
    System.out.println(inst.get_inventory());

    inst.add_widget();
    inst.add_widget();
    System.out.println("Current Number of Items in Inventory:");
    System.out.println(inst.get_inventory());

    inst.remove_widget();
    System.out.println("Current Number of Items in Inventory:");
    System.out.println(inst.get_inventory());
  }
}
