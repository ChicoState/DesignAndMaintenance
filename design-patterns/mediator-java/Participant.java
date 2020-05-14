// Participant is a common interface for any people who interact (make
// transactions) with the DonationCenter (Mediator)
import java.util.ArrayList;

public interface Participant {
  void makeTransaction(String item);
  ArrayList<String> getTransactions();
  String getName();
}
