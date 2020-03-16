// Concrete Class for Ad Factory
public class Ad_Factory implements Publish_Factory {

  @Override
  public Text create_text() {
    return new Ad_Text();
  }

  @Override
  public Creator add_creator() {
    return new Ad_Company();
  }
}
