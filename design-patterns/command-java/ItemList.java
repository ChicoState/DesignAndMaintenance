// Receiver - ItemList knows how to perform the operations associated with
// carrying out the requests to filter and sort the list
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ItemList {

  // _items is a list of item names and their corresponding weight in grams
  private HashMap<String, Integer> _items = new HashMap<String, Integer>();

  // Constructor
  public ItemList(){
    _items.put("flour",361);
    _items.put("salt",6);
    _items.put("baking powder",14);
    _items.put("sugar",12);
    _items.put("butter",85);
    _items.put("buttermilk",255);
  }

  // Create an array from the names of the items (the keys of _items)
  // Sort the item names alphabetically using Collections.sort()
  // Use a for-each loop to print names in alphabetical order
  public void sort_names(){
    List<String> _names = new ArrayList<>(_items.keySet());
    Collections.sort(_names);
    System.out.println("Ingredient items, sorted alphabetically:");
    for(String name:_names) {
      System.out.println(name);
    }
  }

  // Find the item in the list with the lowest weight
  // Use a for-each loop to iterate over the entries and find the lowest weight
  // Print the lowest weight item name and weight in grams
  public void get_lowest_weight(){
    int lowest = Integer.MAX_VALUE;
    String item_name = "";
    for (HashMap.Entry<String,Integer> entry : _items.entrySet()){
      if(entry.getValue() < lowest){
        lowest = entry.getValue();
        item_name = entry.getKey();
      }
    }
    System.out.println("The ingredient with the lowest weight: ");
    System.out.println(item_name + " (" + lowest + " grams)");
  }
}
