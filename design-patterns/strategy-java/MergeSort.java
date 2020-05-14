// MergeSort is a concrete implementation of SortingStrategy
// Given an ArrayList of integers, sort based on type (ascending or descending)
import java.util.ArrayList;

public class MergeSort implements SortingStrategy {
  private String type;

  // Sort integers in the list based on type.
  // The process of merge sort is the same for most of the process except for
  // when the items are merged back into the array.
  @Override
  public void sort(ArrayList<Integer> intList, String type){
    setType(type);
    if(!intList.isEmpty())
    {
      int first = 0;
      int last = intList.size()-1;
      mergeSort(intList, first, last);
    }
  }

  // Set the type for this merge sort ("descend" or "ascend")
  private void setType(String type){
    this.type = type;
  }

  // Get the type for this merge sort ("descend" or "ascend")
  private String getType(){
    return type;
  }

  // Recursively divide the ArrayList until it is sorted into 1 element lists.
  // Then merge() to combine the data (in order) back into original ArrayList.
  private void mergeSort(ArrayList<Integer> intList, int left, int right) {
    if (left < right){
      // Find the middle point
      int mid = (left + right)/2;

      // Sort first and second halves
      mergeSort(intList, left, mid);
      mergeSort(intList, mid + 1, right);

      // Merge the sorted halves
      merge(intList, left, mid, right);
    }
  }

  // Merge left and right sub-arrays into original ArrayList, by comparing the
  // first elements of each sub-array and inserting the element back into the
  // original array (can sort ascending or descending). Continue until each
  // sub-array is empty.
  // First subarray is [left..mid]
  // Second subarray is [mid+1..right]
  private void merge(ArrayList<Integer> intList, int left, int mid, int right)
  {
    // Find sizes of two subarrays to be merged
    int n1 = mid - left + 1;
    int n2 = right - mid;

    // Create temp arrays
    ArrayList<Integer> L = new ArrayList<>();
    ArrayList<Integer> R = new ArrayList<>();

    // Copy data to temp arrays
    int i;
    int j;
    for(i = 0; i < n1; i++){
      L.add(i, intList.get(left + i));
    }
    for(j = 0; j < n2; j++){
      R.add(j, intList.get(mid + 1 + j));
    }

    // Merge the temp arrays based on specified type: ascending or descending

    i = 0;  // Initial index of Left subarray
    j = 0;  // Initial index of Right subarray
    int k = left;  // Initial index of merged subarray
    String t = getType();
    if(t.equals("ascend")){
      while (i < n1 && j < n2)
      {
        if (L.get(i) <= R.get(j)) {
          intList.set(k, L.get(i));
          i++;
        }
        else {
          intList.set(k, R.get(j));
          j++;
        }
        k++;
      }
    }
    else{
      while (i < n1 && j < n2)
      {
        if (L.get(i) >= R.get(j)) {
          intList.set(k, L.get(i));
          i++;
        }
        else {
          intList.set(k, R.get(j));
          j++;
        }
        k++;
      }
    }

    // If any remaining elements in L[], copy into intList
    while (i < n1){
      intList.set(k, L.get(i));
      i++;
      k++;
    }

    // If any remaining elements in R, copy into intList
    while (j < n2){
      intList.set(k, R.get(j));
      j++;
      k++;
    }
  }
}
