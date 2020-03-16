// Concrete Product#1 for abstract Text family: Article Text
import java.util.Scanner;
// Note: current implementation only allows for 1 line of text
public class Article_Text implements Text {
  @Override
  public String get_type() {
    return "Article Text";
  }

  @Override
  public void add_content() {
    Scanner thisText = new Scanner(System.in);
    String articleText;

    System.out.println("Enter Article text:");
    articleText = thisText.nextLine();

    System.out.println("Review your article:\n" + articleText);
  }
}
