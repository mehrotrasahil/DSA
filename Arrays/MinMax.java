package Arrays;

public class MinMax {

    public static void main(String[] args) {
        int arr[] = {4,3,6,1,7,99,10};
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
            if(arr[i] > minValue){
                maxValue = arr[i];
            }
        }

        System.out.println("minValue: " + minValue + " maxValue: " + maxValue);
      
    }
    
}
