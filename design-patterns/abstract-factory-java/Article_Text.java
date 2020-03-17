// Concrete Product#1 for abstract Text family: Article Text
import java.util.Scanner;

public class Article_Text implements Text {
  private String _articleContent = "";

  // return type of product
  @Override
  public String get_type() {
    return "Article Text";
  }

  // User enters text content of article
  @Override
  public void add_content() {
    Scanner _thisText = new Scanner(System.in);
    System.out.println("Enter Article text:");
    _articleContent = _thisText.nextLine();
  }

  // return text content of article
  @Override
  public String get_content() {
    return _articleContent;
  }
}
