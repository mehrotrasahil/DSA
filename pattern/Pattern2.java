package pattern;

public class Pattern2 {
    /* *
     * Input - 5
     * Output - *
     *          * *
     *          * * *
     *          * * * *
     *          * * * * *    
     *        OR
     *  Output - * * * * *
     *           * * * *
     *           * * *
     *           * *
     *           *
     * 
     * row = 5
     * iteration = col -> 1, col -> 2, col -> 3, col -> 4, col -> 5
     */


     public static void main(String[] args) {
             int num = 5;

        System.out.println("First Output ");

        //For the first Output
        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("Second Output ");

        //For the second output
        for(int i = num; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.err.print(" * ");
            }
            System.out.println();
        }
    }

    
}
