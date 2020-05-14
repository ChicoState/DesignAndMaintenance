// Concrete command - LowestWeightCommand
public class LowestWeightCommand implements ListCommand {

  private ItemList _itemList;

  // constructor - LowestWeight initializes a member variable itemList
  public LowestWeightCommand(ItemList _itemList){
    this._itemList = _itemList;
  }

  // Implement the execute method for getting the lowest weight item (in grams)
  @Override
  public void execute() {
      _itemList.get_lowest_weight();
  }
}
