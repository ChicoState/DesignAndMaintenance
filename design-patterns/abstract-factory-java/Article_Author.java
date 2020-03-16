// Concrete Product #1 for abstract Creator family: Article Author
import java.util.Scanner;
// Note: current implementation only allows for 1 line of text
public class Article_Author implements Creator {
  @Override
  public String get_type() {
    return "Article Author";
  }

  @Override
  public void add_creator() {
    Scanner thisAuthor = new Scanner(System.in);
    String articleAuthor;

    System.out.println("Enter Author's Name:");
    articleAuthor = thisAuthor.nextLine();

    System.out.println("Author:\n" + articleAuthor);
  }
}
