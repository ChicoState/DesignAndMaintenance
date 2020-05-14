// ListCommand - Interface for a list of items (Command Pattern)
// The MenuInvoker calls the execute() function for any command, and the
// Concrete classes (LowestWeightCommand and SortByNameCommand) know which
// implementation details to use for executing each command
public interface ListCommand {
  public void execute();
}
