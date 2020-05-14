// SortContext is the Context for Clients to interact with the Sorting Strategy
// It works with any strategy chosen
import java.util.ArrayList;

public class SortContext {
  // SortContext maintains a reference to one of the strategy objects.
  private SortingStrategy strategy;

  // Constructor
  public SortContext() {}

  // Set the strategy for this Context
  public void setStrategy(SortingStrategy strategy){
    this.strategy = strategy;
  }

  // SortContext delegates algorithmic work to the selected SortingStrategy
  public void executeSortStrategy(ArrayList<Integer> intList, String type){
    strategy.sort(intList, type);
  }
}
