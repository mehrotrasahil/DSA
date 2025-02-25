/* *
 * Bubble Sort is a simple comparison-based sorting algorithm that repeatedly swaps adjacent elements 
 * if they are in the wrong order. This process is repeated until the array is completely sorted.
 * 
 * How Bubble Sort Works
   1.  Compare Adjacent Elements: Start from the first element and compare it with the next one.
   2.  Swap if Needed: If the first element is greater than the second, swap them.
   3.  Pass Through the Array: Move to the next pair and repeat the comparison/swapping process.
   4.  Largest Element "Bubbles Up": After each pass, the largest element moves to its correct position.
   5.  Repeat Until Sorted: Continue the process until no swaps are required in a full pass.
 * 
 * 
 * In simple terms Bubble sort checks two adjacent elements at a time and swap if they are not in right order.
 */

 import java.util.*;

 public class BubbleSort{
    public static void main(String[] args){

        int arr[] = new int[]{13, 46, 24, 52, 20, 9};
        int len = arr.length;
        sort(arr, len);

        System.out.println(Arrays.toString(arr));

    }

    private static void sort(int[] arr, int n){

        for(int i = n - 1; i >= 1; i--){
            for(int j = 0; j <= i - 1; j++){
                int temp = 0;
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
 }