package pattern;

public class Pattern4 {
    /* *
     * Input - 5
     * Output - 1
     *          2 2
     *          3 3 3
     *          4 4 4 4 
     *          5 5 5 5 5 
     *        OR
     *  Output - 5 5 5 5 5
     *           4 4 4 4
     *           3 3 3 
     *           2 2 
     *           1
     * 
     * row = 5
     * iteration = col -> 1, col -> 2, col -> 3, col -> 4, col -> 5
     */

     public static void main(String[] args) {

        System.err.println("For the First output");
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.err.println("For the second output");
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
