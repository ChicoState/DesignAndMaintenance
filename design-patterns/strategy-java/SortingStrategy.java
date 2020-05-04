// SortingStrategy is the interface for the Strategy pattern
// SortingStrategy executes operations for sorting a list of integers in
// ascending or descending order, using either InsertionSort or MergeSort.
import java.util.ArrayList;

public interface SortingStrategy {
  public void sort(ArrayList<Integer> intList, String type);
}
