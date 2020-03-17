// Concrete Product #1 for abstract Creator family: Article Author
import java.util.Scanner;
public class Article_Author implements Creator {
  private String _articleAuthor = "";

  @Override
  public String get_type() {
    return "Article Author";
  }

  @Override
  public void add_creator() {
    Scanner _thisAuthor = new Scanner(System.in);
    System.out.println("Enter Author's Name:");
    _articleAuthor = _thisAuthor.nextLine();
  }

  @Override
  public String get_creator() {
    return _articleAuthor;
  }
}
