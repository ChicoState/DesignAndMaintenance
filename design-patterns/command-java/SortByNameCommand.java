// Concrete command - SortByNameCommand
public class SortByNameCommand implements ListCommand {

  private ItemList itemList;

  // constructor - SortByName initializes a member variable itemList
  public SortByNameCommand(ItemList itemList){
    this.itemList = itemList;
  }

  // Implement the execute method for sorting the names alphabetically
  @Override
  public void execute() {
      itemList.sort_names();
  }
}
