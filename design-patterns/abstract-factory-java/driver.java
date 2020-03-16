// driver: hold main class to run the Publisher program
import java.util.Scanner;

public class driver {
  // run program, or print stack trace
  public static void main(String[] args) {
    try {
      driver.run(args);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void run (String[] args) throws Exception {
    Publish_Factory factory;

    Scanner initial = new Scanner(System.in);
    System.out.println("Enter type (article OR ad):");
    String input = initial.nextLine();

    if (input.equals("article")) {
      factory = new Article_Factory();
    }
    else if(input.equals("ad")) {
      factory = new Ad_Factory();
    }
    else {
      System.out.println("Invalid input");
      return;
    }

    Text text = factory.create_text();
    Creator creator = factory.add_creator();

    System.out.println("\n** Create the " + text.get_type() + " **\n");
    text.add_content();

    System.out.println("\n** Now include " + creator.get_type() + " name **\n");
    creator.add_creator();

    // if(text.get_type().equals("Article Text")){
    //   System.out.println("You are creating an article:");
    //   text.add_content();
    // }
    // else{
    //   System.out.println("You are creating an ad");
    //   text.add_content();
    // }

    // if(creator.get_type().equals("Article Author")){
    //   System.out.println("Add Author's name:");
    //   creator.add_creator();
    // }
    // else{
    //   System.out.println("Add Company's name:");
    //   creator.add_creator();
    // }
  }
}

// public class driver {
//   // private Text text;
//   // private Creator creator;
//
//   // public Application(Publish_Factory factory) {
//   //   text = factory.create_text();
//   //   creator = factory.add_creator();
//   // }
//
//   private static Application configureApp() {
//     Application app;
//     Publish_Factory factory;
//
//     Scanner initial = new Scanner(System.in);
//     System.out.println("Enter type (article OR ad):");
//     String input = initial.nextLine();
//     System.out.println("input: " + input);
//     if (input.equals("article")) {
//       factory = new Article_Factory();
//       app = new Application(factory);
//       return app;
//     }
//     else if(input.equals("ad")) {
//       factory = new Ad_Factory();
//       app = new Application(factory);
//       return app;
//     }
//     else {
//       System.out.println("Invalid input");
//       return null;
//     }
//   }
//
//   // run program, or print stack trace
//   public static void main(String[] args) {
//
//     try {
//       driver.run(args);
//     }
//     catch (Exception e) {
//       e.printStackTrace();
//     }
//   }
//
//   // Run quick test of Inventory class member functions
//   public static void run (String[] args) throws Exception {
//     Application app = configureApp();
//     System.out.println("Current type: " + app.get_type());
//     // Article_Text article = new Article_Text();
//     // Article_Author author = new Article_Author();
//     //
//     // System.out.println("Current content type: " + article.get_type());
//     // article.add_content();
//     //
//     // System.out.println("Current creator type: " + author.get_type());
//     // author.add_creator();
//     //
//     //
//     // Ad_Text ad = new Ad_Text();
//     // Ad_Company company = new Ad_Company();
//     //
//     // System.out.println("Current content type: " + ad.get_type());
//     // ad.add_content();
//     //
//     // System.out.println("Current creator type: " + company.get_type());
//     // company.add_creator();
//   }
// }
