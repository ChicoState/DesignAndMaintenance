// InsertionSort is a concrete implementation of SortingStrategy
// Given an ArrayList of integers sort by type (ascending or descending)
import java.util.ArrayList;

public class InsertionSort implements SortingStrategy {

  // Sort integers in the list based on type
  @Override
  public void sort(ArrayList<Integer> intList, String type){
    if(type.equals("descend")){
      sortDescending(intList);
    }
    else{
      sortAscending(intList);
    }
  }

  // Use the insertion sort algorithm to sort integers in ascending order
  private void sortAscending(ArrayList<Integer> intList){
    int n = intList.size();
    for (int i = 1; i < n; ++i) {
        int key = intList.get(i);
        int j = i - 1;

        // Move elements of intList[0..i-1], that are greater than key, to one
        // position ahead of their current position
        while (j >= 0 && intList.get(j) > key) {
          intList.set(j + 1,intList.get(j));
          j = j - 1;
        }
        intList.set(j + 1, key);
    }
  }

  // Use the insertion sort algorithm to sort integers in descending order
  public void sortDescending(ArrayList<Integer> intList) {
    int n = intList.size();
    for (int i = 1; i < n; ++i) {
        int key = intList.get(i);
        int j = i - 1;

        // Move elements of intList[0..i-1], that are greater than key, to one
        // position ahead of their current position
        while (j >= 0 && intList.get(j) < key) {
          intList.set(j + 1,intList.get(j));
          j = j - 1;
        }
        intList.set(j + 1, key);
    }
  }
}
