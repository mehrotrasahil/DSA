package sorting;

import java.util.Arrays;

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
 * comparing adjacent elements.
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
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 10, 12, 1, 5, 2, 9, 2 };

        sortArrInAsc(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArrInAsc(int[] arr, int n) {

        /*
         * First loop will go from n-1 to ith index.
         * As the last element wwill already be sorted after each iteration.
         */

        for (int i = n - 1; i >= 1; i--) {
            /*
             * Second loop will go from o to i - 1.
             * n -1 is because we do not want the last element to get compared with the net
             * element which is not even present
             */
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
