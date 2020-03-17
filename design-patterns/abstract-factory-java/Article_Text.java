// Concrete Product#1 for abstract Text family: Article Text
import java.util.Scanner;

public class Article_Text implements Text {
  private String _articleContent = "";

  @Override
  public String get_type() {
    return "Article Text";
  }

  @Override
  public void add_content() {
    Scanner _thisText = new Scanner(System.in);
    System.out.println("Enter Article text:");
    _articleContent = _thisText.nextLine();
  }

  @Override
  public String get_content() {
    return _articleContent;
  }
}
