package basics.pattern;

public class Pattern5 {
    /* *
     * Input - 3
     * Output -  
     *   *  
        *** 
       *****
     * row = 3
     * Algo - 
     * 1. Take the number of rows that should be printed
     * 2. Print the number of space and then star and then space
     * Formula for getting the space - num - i -1 ;
     * Formula for getting the star - i*2+1
     */

    public static void main(String[] args) {
        int num = 5;

        System.out.println("First pattern solution");
        for(int i = 0; i < num; i++){
          for(int j = 0; j < num-i-1; j++){
            System.out.print(" ");
          }

          for(int k = 0; k < 2*i+1; k++){
            System.out.print("*");
          }
          for(int l = 0; l < num-i-1; l++ ){
            System.out.print(" ");
          }
          System.out.println();
        }



        System.err.println("Pattern's inverse solution");


    }
}
