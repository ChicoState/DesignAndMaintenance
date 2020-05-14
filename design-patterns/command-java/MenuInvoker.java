// MenuInvoker is a list of commands. The Client can add items to the list, and
// invoke the execute() command for each item via the MenuInvoker
import java.util.List;
import java.util.ArrayList;

public class MenuInvoker {

    private final List<ListCommand> _listCommands = new ArrayList<>();

    // Add items to the list using the add() method of List
    public void add_item(ListCommand listCommand){
      _listCommands.add(listCommand);
    }

    // Invoke a command in the Menu to execute the operation
    // (the actual execution varies depending on the given command)
    public void execute_operation() {
        for(ListCommand cmd : _listCommands){
          cmd.execute();
        }
    }
}
