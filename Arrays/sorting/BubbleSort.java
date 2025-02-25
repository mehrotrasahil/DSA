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
 * 
 * In this we will solve the problem using iterative as well as the recursive approach
 */

 import java.util.*;

 public class BubbleSort{
    public static void main(String[] args){

        int arr[] = new int[]{13, 46, 24, 52, 20, 9};
        int len = arr.length;
        sort(arr, len);

        System.out.println(Arrays.toString(arr));

    }
/**
 * Iterative approach for Bubble Sort.
 * 
 * This method sorts an array of integers using the Bubble Sort algorithm.
 * Bubble Sort repeatedly steps through the list, compares adjacent elements, 
 * and swaps them if they are in the wrong order. The pass through the list 
 * is repeated until the list is sorted.
 * 
 * Algorithm:
 * - The outer loop runs from the last index (n-1) to the first index (1).
 * - The inner loop iterates from the start of the array to (i-1), 
 *   comparing adjacent elements.
 * - If the current element is greater than the next element, they are swapped.
 * - After each pass, the largest element bubbles up to its correct position.
 * - The process is repeated until the entire array is sorted.
 * 
 * Example:
 * Input: [5, 3, 8, 4, 2]
 * 
 * Iteration 1:
 * [3, 5, 8, 4, 2] -> (5 > 3, swap)
 * [3, 5, 8, 4, 2] -> (5 < 8, no swap)
 * [3, 5, 4, 8, 2] -> (8 > 4, swap)
 * [3, 5, 4, 2, 8] -> (8 > 2, swap) -> Largest element (8) placed at the end
 * 
 * Iteration 2:
 * [3, 5, 4, 2, 8] -> (3 < 5, no swap)
 * [3, 4, 5, 2, 8] -> (5 > 4, swap)
 * [3, 4, 2, 5, 8] -> (5 > 2, swap) -> Second largest element (5) placed
 * 
 * Iteration 3:
 * [3, 4, 2, 5, 8] -> (3 < 4, no swap)
 * [3, 2, 4, 5, 8] -> (4 > 2, swap) -> Third largest element (4) placed
 * 
 * Iteration 4:
 * [2, 3, 4, 5, 8] -> (3 > 2, swap) -> The array is now sorted
 * 
 * Time Complexity:
 * - Worst and Average Case: O(n^2) (when the array is in reverse order)
 * - Best Case: O(n) (when the array is already sorted)
 * 
 * Space Complexity: O(1) (sorting is done in place)
 */

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