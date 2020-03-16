// Concrete class for Article Factory
public class Article_Factory implements Publish_Factory {

  @Override
  public Text create_text() {
    return new Article_Text();
  }

  @Override
  public Creator add_creator() {
    return new Article_Author();
  }
}
