package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 3, 8, 2, 13, 1 };

        sortedArrInAsc(arr, arr.length);

        System.out.println(Arrays.toString(arr));

        sortedArrInDesc(arr, arr.length);

        System.out.println(Arrays.toString(arr));

    }

    // Function to sort the array using selection sort algorithm

    private static void sortedArrInAsc(int[] arr, int n) {

        /*
         * First loop to get the value of i
         * ith index will hold the smallest value in the array
         */

        for (int i = 0; i < n - 1; i++) {
            // Consider i has the minum value.
            int min = i;

            /*
             * Second loop will check the smallest value.
             * Loop will go from i + 1 why? because - we want to search the smallest element
             * if it exists after the ith index
             * If the value of jth index is smaller than ith index than swap the data
             */

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swap the found smallest element with the first element
            int temp = arr[min]; // store arr[min] in a temp variable.
            arr[min] = arr[i]; // store arr[i] to arr[min]
            arr[i] = temp;
        }
    }

    private static void sortedArrInDesc(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int max = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }

            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
    }
}
