/* *
 * 
 * Insertion Sort is a simple and efficient comparison-based sorting algorithm that builds a sorted array one element at a time. 
 * It works similarly to sorting playing cards in your hand—each new card is inserted into its correct position relative to the 
 * already sorted cards.
 * 
 * 
 *  * How Insertion Sort Works
    1.  Assume the first element is already sorted.
    2.  Pick the next element and compare it with the elements in the sorted part.
    3.  Shift larger elements one position to the right to make space.
    4.  Insert the picked element in its correct position.
    5.  Repeat the process for all elements until the array is fully sorted.
 * 
 * 
 */
import java.util.*;

 public class InsertionSort{
    public static void main(String[] args){
        int[] arr = new int[]{5,43,13,65,1,6,0};
        int len = arr.length;
        for(int i = 0; i < len; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
               System.out.println("inside while");
               int temp = arr[j-1];
               arr[j-1] = arr[j];
               arr[j] = temp; 
               j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
 }