/* *
 * 
 * Merge Sort is a divide and conquer algorithm that:

    1.  Divides the array into two halves.
    2.  Recursively sorts both halves.
    3.  Merges the sorted halves back together.
 * 
 * 
 * 
 */

 import java.util.*;
 import java.util.*;

 public class MergeSort {
     public static void main(String[] args) {
         int[] unsortedArr = new int[]{4, 1,3,9,7};
         int low = 0;
         int high = unsortedArr.length - 1;
 
         sortArr(unsortedArr, low, high);
 
         System.out.println(Arrays.toString(unsortedArr));
     }
 
     private static void sortArr(int[] arr, int low, int high) {
         if (low >= high) return; // Fix: Changed from 'low == high' to 'low >= high'
 
         int mid = (low + high) / 2;
 
         sortArr(arr, low, mid);
         sortArr(arr, mid + 1, high);
         merge(arr, low, mid, high);
     }
 
     private static void merge(int[] arr, int low, int mid, int high) {
        //create a temp array
        int[] temp = new int[high - low + 1];
        int left = low; // pointer for left half 
        int right = mid + 1; // pointer for right half
        int index = 0; //index for temp array

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[index] = arr[left];
                left++;
            }else{
                temp[index] = arr[right];
                right++;
            }
            index++;
        }

        while(left <= mid){
            temp[index] = arr[left];
            left++;
            index++;
        }

        while(right <= high){
            temp[index] = arr[right];
            right++;
            index++;
        }

        /* *
         * Copy the elements from temp array to original array.
         * arr[low + i] = temp[i];
         * Final Visualization
            temp[i]	arr[low + i]
            temp[0]	arr[low + 0]
            temp[1]	arr[low + 1]
            temp[2]	arr[low + 2]
            temp[3]	arr[low + 3]
            temp[4]	arr[low + 4]
            temp[5]	arr[low + 5]
            temp[6]	arr[low + 6]
            temp[7]	arr[low + 7]
         * 
         *  Why Use low + i Instead of Just i?
            temp is always indexed from 0 to temp.length - 1.
            But the sorted segment in arr starts from low.
            So, we need to offset i by low when copying elements back.
            If we just wrote:

            arr[i] = temp[i]; 
            it would incorrectly overwrite arr[0], arr[1], etc., regardless of where the merge started.
         * 
         * 
         * 
         */

        for(int i = 0; i < temp.length; i++){
            arr[low + i] = temp[i];
        }
     }
 }
 