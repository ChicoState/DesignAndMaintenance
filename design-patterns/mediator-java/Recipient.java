// Recipient is a concrete Participant. In this case, all transactions are
// items being distributed (removing items from the list of items available)
import java.util.ArrayList;

public class Recipient implements Participant {
  private ArrayList<String> _received = new ArrayList<>();
  private final String _name;
  private final DonationMediator _donationCenter;

  // constructor - establishes the Mediator and name for this Participant
  public Recipient(DonationMediator dc, String name){
    _donationCenter = dc;
    _name = name;
  }

  // Make a transaction (remove an item from list of donations)
  // DonationCenter gets notified to retrieve an item (if the item is currently
  // available) to give to the recipient
  @Override
  public void makeTransaction(String item){
    if(_donationCenter.retrieveItem(item)){
      _received.add(item);
    }
    else{
      System.out.println(_name + " requested '" + item + "', but it was unavailable");
    }
  }

  // Get the list of transactions (items received) for this Recipient
  @Override
  public ArrayList<String> getTransactions(){
    return _received;
  }

  // Get the name of this Recipient
  @Override
  public String getName(){
    return _name;
  }
}
