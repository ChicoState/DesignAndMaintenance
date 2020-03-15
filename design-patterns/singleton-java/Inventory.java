// compile: javac Inventory.java
//  - creates Inventory.class (executable byte code)
// run: java Inventory
public final class Inventory {

  private static Inventory _instance;
  private int _count = 0;

  // Protected constructor; never needs to be called
  protected Inventory(){
  }

  // Return the Singleton instance of the Inventory
  public static Inventory get_instance() {
    if(_instance == null){
      _instance = new Inventory();
      System.out.println("New instance of inventory created");
    }
    return _instance;
  }

  // Add one widget to the Inventory
  public void add_widget() {
    _count++;
  }

  // Remove a widget from the Inventory
  public void remove_widget() {
    _count--;
  }

  // Return the number of widgets currently in inventory
  public int get_inventory() {
    return _count;
  }

  // Client can get the Inventory instance and run, or print stack trace
  public static void main(String[] args) {
    try {
      Inventory inventory = Inventory.get_instance();
      inventory.run(args);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  // Run quick test of Inventory class member functions
  public void run (String[] args) throws Exception {
    System.out.println("Current Number of Items in Inventory:");
    System.out.println(Inventory.get_instance().get_inventory());

    Inventory.get_instance().add_widget();
    Inventory.get_instance().add_widget();
    System.out.println("Current Number of Items in Inventory:");
    System.out.println(Inventory.get_instance().get_inventory());

    Inventory.get_instance().remove_widget();
    System.out.println("Current Number of Items in Inventory:");
    System.out.println(Inventory.get_instance().get_inventory());
  }
}
