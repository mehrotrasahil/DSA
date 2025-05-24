package practice;

import java.util.Arrays;

public class Demo {

    //3*3 matrics
    /* 
     * input -  1 2 3 
                4 5 6 
                7 8 9 

     * output - 0 2 3
                0 0 0
                0 8 9
     */


     public static void main(String[] args) {
        int[][][] arr = {{{1,2,3}},{{4,5,6}},{{7,8,9}}};
        int [][][] ans = new int[3][3][3];

        int target = 4;


        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i][0][0]);            
            for(int j = 0; j < arr[i].length; j++){
                for(int k = 0; k < arr[i][j].length; k++){
                    // System.out.println(arr[i][j][k]);
                }
            }
        }


     }
}
