package basics.pattern;

public class Pattern3 {
        /* *
     * Input - 5
     * Output - 1
     *          1 2
     *          1 2 3
     *          1 2 3 4 
     *          1 2 3 4 5 
     *        OR
     *  Output - 1 2 3 4 5
     *           1 2 3 4
     *           1 2 3
     *           1 2
     *           1
     * 
     * row = 5
     * iteration = col -> 1, col -> 2, col -> 3, col -> 4, col -> 5
     */

     public static void main(String[] args) {
        
        System.out.println("For the first Output");
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.err.print(j);
            }
            System.err.println();
        }

        System.out.println("For the Second Output");
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
     }
}
