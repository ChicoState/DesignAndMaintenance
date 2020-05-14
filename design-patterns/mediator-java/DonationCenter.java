// DonationCenter concrete implementation of DonationMediator
// Instead of Donors and Recipients interacting with each other directly, the
// DonationCenter keeps track of all items donated and all items distributed,
// helping all interactions run smoothly.
import java.util.ArrayList;

public class DonationCenter implements DonationMediator {
  private ArrayList<String> curAvailable = new ArrayList<> ();

  // Store an item in the list of available items
  @Override
  public void storeItem(String item){
    curAvailable.add(item);
  }

  // Retrieve an item from the list of items (if it's available)
  // Return true if item was available and distributed, else return false
  @Override
  public boolean retrieveItem(String item){
    int itemIndex = curAvailable.indexOf(item);
    if(itemIndex != -1){
      curAvailable.remove(itemIndex);
      return true;
    }
    else{
      return false;
    }
  }

  // Return the list of currently available items
  @Override
  public ArrayList<String> getAvailableItems(){
    return curAvailable;
  }
}
