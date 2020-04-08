// Common interface for Publisher Abstract Factory
// Publish Factory knows about all of its abstract products (Text and Creator)
public interface Publish_Factory {
  Text create_text();
  Creator add_creator();
}
