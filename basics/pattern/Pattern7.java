package basics.pattern;

/* *
     * Input - 3
     * Output -    *
     *            * *
     *          * * *  
     *        OR
     *  Output - * * *
     *             * *
     *               *
     * 
     * row = 5
     * iteration = col -> 1, col -> 2, col -> 3, col -> 4, col -> 5
     */

public class Pattern7 {
    public static void main(String[] args) {
        int n = 3;
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n-1; j++){
                System.out.print( " ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
