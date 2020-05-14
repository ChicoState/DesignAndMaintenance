// driver: holds main class to run the Mediator Donation program
import java.util.ArrayList;

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
    DonationMediator mediator = new DonationCenter();

    Participant donor = new Donor(mediator, "Don");
    donor.makeTransaction("food");
    donor.makeTransaction("clothes");
    System.out.println(donor.getName() +" donated: "+ donor.getTransactions());

    Participant donor2 = new Donor(mediator, "Donna");
    donor2.makeTransaction("books");
    donor2.makeTransaction("furniture");
    donor2.makeTransaction("jewelry");
    System.out.println(donor2.getName()+ " donated: "+ donor2.getTransactions());

    System.out.println("Available Donations: " + mediator.getAvailableItems());

    Participant recipient = new Recipient(mediator, "Ree");
    recipient.makeTransaction("food");
    recipient.makeTransaction("books");
    System.out.println(recipient.getName() + " received: " + recipient.getTransactions());

    Participant recipient2 = new Recipient(mediator, "Rick");
    recipient2.makeTransaction("appliance");
    recipient2.makeTransaction("furniture");
    System.out.println(recipient2.getName() + " received: " + recipient2.getTransactions());
    
    System.out.println("Available Donations: " + mediator.getAvailableItems());

  }
}
