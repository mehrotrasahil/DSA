package Arrays;

import java.util.Arrays;

public class MinMax {

    static class Pair{
        public int min;
        public int max;

    }

    public static void main(String[] args) {
        int arr[] = {4,3,6,1,7,99,10};
        Arrays.sort(arr);
        
        Pair pair = new Pair();

        pair.min = arr[0];
        pair.max = arr[arr.length - 1];

        System.out.println("MinValue " + pair.min + " MaxValue " + pair.max);


        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }

        System.out.println("minValueFromLinearApproach: " + minValue + " maxValueFromLinearApproach: " + maxValue);
      
    }
    
}
