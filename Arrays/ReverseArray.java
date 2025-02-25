/* 
 Reverse an array of Integer
 */

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseArray { 
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] result = new int[arr.length];

        //Liner approach
        for(int i = arr.length -1; i >= 0; i--){
            result[(arr.length -1) - i] = arr[i];
        }

        for(int res : result){
            System.out.println(res);
        }

        // Tow pointer methods
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left ++;
            right --;
        }
       
        for(int res : arr){
            System.out.print(res + " ");           
        }


        System.out.println();
        //Using Collections

        int[] arr2 = {10, 20, 30, 40, 50};


        ArrayList<Integer> arrayList = Arrays.stream(arr2).boxed().collect(Collectors.toCollection(ArrayList::new));

        Collections.reverse(arrayList);

        for(Integer res : arrayList){
            System.out.print(res + " ");
        }


    }
} 
