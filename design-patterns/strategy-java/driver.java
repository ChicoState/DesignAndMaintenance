// driver: holds main class to run the SortStrategy program (Strategy example)
import java.util.ArrayList;
import java.util.Scanner;

public class driver {
  public static void main(String[] args) {
    try {
      driver.run(args);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  // A Client chooses the sorting strategy, then sort executes based on
  // the context chosen. This example uses a short unsorted list, but an
  // ArrayList of any size, that holds integers in any order, may be used
  public static void run (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> intList = new ArrayList<>();
    intList.add(5);
    intList.add(3);
    intList.add(1);
    intList.add(2);
    intList.add(4);
    System.out.println("Original intList: " + intList);

    // Ask the user what strategy they would like to use to perform the sort
    System.out.println("Enter 1 (sort in ascending order) or 2 (sort in descending order)");
    String order = scanner.nextLine();  // Read user input
    System.out.println("Enter 1 (insertion sort) or 2 (merge sort)");
    String choice = scanner.nextLine();  // Read user input

    // SortContext is set and executed based on the user's choices.
    SortContext sortContext = new SortContext();
    switch(choice){
      case "1":
        sortContext.setStrategy(new InsertionSort());
        break;
      case "2":
        sortContext.setStrategy(new MergeSort());
        break;
      default:
        order = "0";
        break;
    }

    switch(order){
      case "1":
        sortContext.executeSortStrategy(intList, "ascend");
        break;
      case "2":
        sortContext.executeSortStrategy(intList, "descend");
        break;
      default:
        System.out.println("Sorry, not a valid sort strategy");
        break;
    }
    // If user picked a valid SortStrategy, list will now be sorted 
    System.out.println("Sorted List: " + intList);
  }
}
