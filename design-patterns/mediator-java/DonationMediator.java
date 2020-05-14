// DonationMediator: interface for concrete DonationCenter
// Implements the Mediator design patter. The Mediator defines how Participants
// interact with the available items at a donation center
import java.util.ArrayList;

public interface DonationMediator {
  public void storeItem(String item);
  public boolean retrieveItem(String item);
  public ArrayList<String> getAvailableItems();
}
