package sorting;

import java.util.Arrays;

public class InstertionSort {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 5, 1, 8, 4 };

        sortedArr(arr);
        System.out.println(Arrays.toString(arr));

    }

    /*
     * Insertion Sort works by dividing the array into two parts:
     * - Left side: sorted part
     * - Right side: unsorted part
     *
     * We assume the first element (index 0) is already sorted.
     * Starting from index 1, we pick each element (called 'key') and insert it
     * into the correct position in the sorted part of the array.
     */
    private static void sortedArr(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // Store the current element to be placed at the correct position

            int key = arr[i];
            int j = i - 1;

            /*
             * Shift elements of the sorted part to the right if they are greater than
             * 'key'.
             * We keep shifting until we find the correct position for 'key',
             * or we reach the beginning of the array.
             */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];// Shift element to the right
                j--; // Move to the previous element
            }

            /*
             * After shifting, 'j' will be pointing to the index just before where 'key'
             * should go.
             * So, place the 'key' at index j+1.
             */
            arr[j + 1] = key;
        }
        /*
         * After each iteration of the outer loop, one more element is added to the
         * sorted part.
         */
    }
}