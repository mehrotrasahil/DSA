
/* *
 * 
 *
    Quick Sort is a divide-and-conquer algorithm like the Merge Sort. But unlike Merge sort, this algorithm does not use any extra array for sorting(though it uses an auxiliary stack space). So, from that perspective, Quick sort is slightly better than Merge sort.

    This algorithm is basically a repetition of two simple steps that are the following:

    Pick a pivot and place it in its correct place in the sorted array.
    Shift smaller elements(i.e. Smaller than the pivot) on the left of the pivot and larger ones to the right.
    Now, let’s discuss the steps in detail considering the array {4,6,2,5,7,9,1,3}:

    Step 1: The first thing is to choose the pivot. A pivot is basically a chosen element of the given array. The element or the pivot can be chosen by our choice. So, in an array a pivot can be any of the following:

    1.    The first element of the array
    2.    The last element of the array
    3.    Median of array
    4.    Any Random element of the array
    5.    After choosing the pivot(i.e. the element), we should place it in its correct position(i.e. The place it should be after the array gets sorted) in the array. For example, if the given array is {4,6,2,5,7,9,1,3}, the correct position of 4 will be the 4th position.

Note: Here, we have chosen the first element as our pivot. You can choose any element as per your choice.
    
    Step 2: In step 2, we will shift the smaller elements(i.e. Smaller than the pivot) to the left of the pivot and the larger ones to the right of the pivot. In the example, if the chosen pivot is 4, after performing step 2 the array will look like: {3, 2, 1, 4, 6, 5, 7, 9}. 

    From the explanation, we can see that after completing the steps, pivot 4 is in its correct position with the left and right subarray unsorted. Now we will apply these two steps on the left subarray and the right subarray recursively. And we will continue this process until the size of the unsorted part becomes 1(as an array with a single element is always sorted).

    So, from the above intuition, we can get a clear idea that we are going to use recursion in this algorithm.

    To summarize, the main intention of this process is to place the pivot, after each recursion call, at its final position, where the pivot should be in the final sorted array. 

 */

 import java.util.Arrays;

 public class QuickSort {
     public static void main(String[] args) {
         int[] arr = {4, 6, 1, 5, 7, 4, 2, 8};
         quickSort(arr, 0, arr.length - 1);
         System.out.println(Arrays.toString(arr));
     }
 
     private static void quickSort(int[] arr, int low, int high) {
         if (low < high) {
             int pivotIndex = partition(arr, low, high);
             quickSort(arr, low, pivotIndex - 1);
             quickSort(arr, pivotIndex + 1, high);
         }
     }
 
     private static int partition(int[] arr, int low, int high) {
         int pivot = arr[high]; // Choosing the last element as pivot
         int i = low - 1; // Index for smaller element
 
         for (int j = low; j < high; j++) {
             if (arr[j] < pivot) {
                 i++;
                 swap(arr, i, j);
             }
         }
         
         swap(arr, i + 1, high); // Place pivot in correct position
         return i + 1;
     }
 
     private static void swap(int[] arr, int i, int j) {
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
     }
 }
 