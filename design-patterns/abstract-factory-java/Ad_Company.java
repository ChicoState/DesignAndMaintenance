// Concrete Product#2 for abstract Creator family: Ad Company
import java.util.Scanner;

public class Ad_Company implements Creator {
  private String _adCompany = "";

  @Override
  public String get_type() {
    return "Ad Company";
  }

  @Override
  public void add_creator() {
    Scanner _thisText = new Scanner(System.in);
    System.out.println("Enter Your Company Name:");
    _adCompany = _thisText.nextLine();
  }

  @Override
  public String get_creator() {
    return _adCompany;
  }
}
