package basics.recurssion;

/* 
 * Print Fibonacci Series up to Nth term

    Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.

    Examples:

    Example 1:
    Input: N = 5
    Output: 0 1 1 2 3 5
    Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)

    Example 2:
    Input: 6

    Output: 0 1 1 2 3 5 8
    Explanation: 0 1 1 2 3 5 8 is the fibonacci series upto 6th term.(o based indexing)
 */
public class Fabonacci {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++){
            System.out.println(fabonacci(i));

        }
    }

    static int fabonacci(int n){
        if(n <= 1){
            return n;
        }

        int last = fabonacci(n -1);
        int sLast = fabonacci(n - 2);

        return last + sLast;
    }
}
