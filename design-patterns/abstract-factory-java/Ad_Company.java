// Concrete Product#2 for abstract Creator family: Ad Company
import java.util.Scanner;

public class Ad_Company implements Creator {
  private String _adCompany = "";

  // return type of product
  @Override
  public String get_type() {
    return "Ad Company";
  }

  // User enters the name of the company (creator of the ad)
  @Override
  public void add_creator() {
    Scanner _thisText = new Scanner(System.in);
    System.out.println("Enter Your Company Name:");
    _adCompany = _thisText.nextLine();
  }

  // return the name of the company (creator of the ad)
  @Override
  public String get_creator() {
    return _adCompany;
  }
}
