package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 7, 6, 2, 0, 9 };
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));
    }

    /*
     * Quick Sort Function
     * -------------------
     * This function keeps dividing the array into parts.
     * It picks a pivot, places it in the correct position,
     * then sorts the left and right parts of the array separately.
     */
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            /*
             * Partition the array and get the pivot index.
             * All elements to the left of the pivot will be smaller,
             * and all elements to the right will be larger.
             */
            int pivotIndex = partition(arr, low, high);

            // Recursively apply quickSort on the left sub-array
            quickSort(arr, low, pivotIndex - 1);

            // Recursively apply quickSort on the right sub-array
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    /*
     * Partition Function
     * ------------------
     * This function:
     * - Chooses a pivot (we are choosing the last element)
     * - Rearranges the array so that all elements less than or equal to the pivot
     * come before it, and all elements greater come after it.
     * - Places the pivot in its final sorted position
     * - Returns the index of the pivot
     */
    private static int partition(int[] arr, int low, int high) {

        // We choose the last element as the pivot
        int pivot = arr[high];

        // Index of the smaller element; starts one before 'low'
        int i = low - 1;

        for (int j = low; j < high; j++) {
            /*
             * If the current element is smaller than or equal to the pivot,
             * we want to move it to the left side (before pivot).
             */
            if (arr[j] <= pivot) {
                i++; // Increase the index for smaller elements

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        /*
         * Finally, place the pivot after the last smaller element.
         * This puts the pivot in the correct sorted position.
         */
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the final index of the pivot
        return i + 1;
    }
}
