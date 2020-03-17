// Concrete Product#2 for abstract Text family: Ad Text
import java.util.Scanner;
public class Ad_Text implements Text {
  private String _adContent = "";

  @Override
  public String get_type() {
    return "Ad Text";
  }

  @Override
  public void add_content() {
    Scanner _thisText = new Scanner(System.in);
    System.out.println("Enter Ad text:");
    _adContent = _thisText.nextLine();
  }

  @Override
  public String get_content() {
    return _adContent;
  }
}
