// driver: holds main class to run the ListCommand program (Command example)

public class driver {
  public static void main(String[] args) {
    try {
      driver.run(args);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  // A Client can specify which commands to execute by adding them to the menu,
  // and then the items can be executed in the given order
  public static void run (String[] args) throws Exception {
    MenuInvoker menuInvoker = new MenuInvoker();
    ItemList itemList = new ItemList();
    menuInvoker.add_item(new LowestWeightCommand(itemList));
    menuInvoker.add_item(new SortByNameCommand(itemList));

    menuInvoker.execute_operation();
  }
}
