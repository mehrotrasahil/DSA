package Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7};

        int k = 4;

        int[] temp = new int[arr.length];
        
        for(int i = arr.length - 1; i >= 0; i--){
          
            temp[(i+k)%arr.length] = arr[i];
        }

        arr = temp;

        for(int num : arr){
            System.out.print(num);
        }

    }
}
