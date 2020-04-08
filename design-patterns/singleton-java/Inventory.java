// Inventory class: example of Singleton design pattern
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
}
