package  Arrays;
import java.util.*;

public class RemoveDuplicate{
    public static void main(String[] args){
        int[] arr = {1,1,2};
        int i = 0;

        for(int j = 1; j < arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}