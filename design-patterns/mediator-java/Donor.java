// Donor is a concrete Participant. In this case, all transactions are
// donations (adding items to the list of items available to donate)
import java.util.ArrayList;

public class Donor implements Participant {
  private ArrayList<String> _donations = new ArrayList<>();
  private final String _name;
  private final DonationMediator _donationCenter;

  // constructor - establishes the Mediator and name for this Participant
  public Donor(DonationMediator dc, String name){
    _donationCenter = dc;
    _name = name;
  }

  // Make a transaction (add an item to list of donations)
  // DonationCenter gets notified that they need to store an item
  @Override
  public void makeTransaction(String item){
    _donations.add(item);
    _donationCenter.storeItem(item);
  }

  // Get the list of transactions (donations) from this Donor
  @Override
  public ArrayList<String> getTransactions(){
    return _donations;
  }

  // Get the name of this Donor
  @Override
  public String getName(){
    return _name;
  }
}
