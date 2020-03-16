// Concrete Product#2 for abstract Creator family: Ad Company
import java.util.Scanner;
// Note: current implementation only allows for 1 line of text
public class Ad_Company implements Creator {
  @Override
  public String get_type() {
    return "Ad Company";
  }

  @Override
  public void add_creator() {
    Scanner thisText = new Scanner(System.in);
    String adCompany;

    System.out.println("Enter Your Company Name:");
    adCompany = thisText.nextLine();

    System.out.println("This Ad created by:\n" + adCompany);
  }
}
