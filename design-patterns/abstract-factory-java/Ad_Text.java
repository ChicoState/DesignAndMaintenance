// Concrete Product#2 for abstract Text family: Ad Text
import java.util.Scanner;
// Note: current implementation only allows for 1 line of text
public class Ad_Text implements Text {
  @Override
  public String get_type() {
    return "Ad Text";
  }

  @Override
  public void add_content() {
    Scanner thisText = new Scanner(System.in);
    String adText;

    System.out.println("Enter Ad text:");
    adText = thisText.nextLine();

    System.out.println("Your Ad text:\n" + adText);
  }
}
