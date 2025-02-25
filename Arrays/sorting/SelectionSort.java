/* *
 * It works by repeatedly selection the smallest number in the array and swapping it with it's correct position.
 * How Selection Sort Works
   1.  Find the Minimum Element: Start from the first element and find the smallest element in the unsorted part of the array.
   2.  Swap the Minimum Element: Swap it with the first element of the unsorted part.
   3   Move the Boundary: The boundary between the sorted and unsorted parts shifts by one.
   4.  Repeat: Continue this process for the remaining elements until the entire array is sorted.
 */

 import java.util.*;

 public class SelectionSort{
    public static void main (String[] args){
        int[] arr = new int[]{13, 46, 24, 52, 20, 9};
        int n = arr.length; 
        solution(arr, n);

        System.out.println(Arrays.toString(arr));
    }

    private static void solution(int[] arr, int arr_length){
        /* 
         * [19,51,4,52,10,1];
         * min = 19
         * temp = 0
         * temp - arr[min];
         * arr[min] = arr[i];
         * arr[i] = temp
         */
        for(int i = 0; i < arr_length; i++){

            int min = i;
            for(int j = i; j < arr_length; j++){
                int temp = 0;
                if(arr[j] < arr[min]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
    }
 }