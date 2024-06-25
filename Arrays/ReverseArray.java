/* 
 Reverse an array of Integer
 */

package Arrays;

import java.util.*;

class Reverse{
    public static List<Integer> reverseArr(List<Integer> arr){
        List<Integer> result = new ArrayList<>();

        for(int i = arr.size() - 1; i >= 0; i--){
            result.add(arr.get(i));
        }
        return result;
    }
}

public class ReverseArray{
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        List<Integer> res = Reverse.reverseArr(arr);
        for(int num : res) {
            System.out.println(num);
        }
    }
}


/* class Reverse {
    public static int[] reverseArr(int[] arr) {
        int[] result = new int[arr.length]; // Use arr.length instead of fixed size 5
        int temp = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            result[temp] = arr[i];
            temp++;
        }
        return result;
    }
}

public class ReverseArray { 
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] result = Reverse.reverseArr(arr);

        for(int num : result) {
            System.out.println(num);
        }
    }
} */
