/* 
 Reverse an array of Integer
 */

package Arrays;


/* class Reverse{
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
} */


class Reverse {
    public static void reverseArr(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;

            right--;
        }


        // int temp = 0;
        // for(int i = arr.length - 1; i >= 0; i--) {
        //     result[temp] = arr[i];
        //     temp++;
        // }
    }
}

public class ReverseArray { 
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Reverse.reverseArr(arr);

        for(int num : arr) {
            System.out.println(num);
        }
    }
} 
