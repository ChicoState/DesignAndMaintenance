// driver: hold main class to test the Publisher Abstract Factory
// The client has access to all of the interfaces (Publish Factory, Text, and
// Creator) and their public methods
import java.util.Scanner;

// run program, or print stack trace
public class driver {
  public static void main(String[] args) {
    try {
      driver.run(args);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  // test Publish factory with Article and Ad factories
  public static void run (String[] args) throws Exception {
    Publish_Factory factory;

    // Determine type of factory being used (Publishing an article or an ad)
    Scanner initial = new Scanner(System.in);
    System.out.println("Enter type (article/ad):");
    String input = initial.nextLine();

    if (input.toLowerCase().equals("article")) {
      factory = new Article_Factory();
    }
    else if(input.toLowerCase().equals("ad")) {
      factory = new Ad_Factory();
    }
    else {
      System.out.println("Invalid input");
      return;
    }

    // Regardless of type, everything that comes from this publisher includes
    // a creator (author/company) and text (article content/ad content)
    Text text = factory.create_text();
    Creator creator = factory.add_creator();
    String textType = text.get_type();
    String creatorType = creator.get_type();

    System.out.println("\n** Create the " + textType + " **\n");
    text.add_content();

    System.out.println("\n** Now include " + creatorType + " name **\n");
    creator.add_creator();

    System.out.println("\n" + textType + " and " + creatorType
      + " entries complete.");
    System.out.println("Text: " + text.get_content());
    System.out.println("Created By: " + creator.get_creator());
  }
}
