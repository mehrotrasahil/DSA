package Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};  //out put = 5,6,1,2,3,4

        int last_el = arr[arr.length - 1];
        int second_last_el = arr[arr.length -2];
        for(int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i - 1];
            

        }
        arr[0] = last_el;

        for(int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i - 1];
            

        }
        arr[0] = second_last_el;

        for(int ele : arr){
            System.out.print(ele);
        }
    }
}
