package basicQues;


public class AllDivisors{

    /* *
     * Problem Statement: Given an integer N, return all divisors of N.
     * A divisor of an integer N is a positive integer that divides N without leaving a remainder. 
     * In other words, if N is divisible by another integer without any remainder, then that integer is considered a divisor of N.
     */


     public static void main(String[] args) {
        int n = 36;

        for(int  i = 1; i < n; i++){
            if(n % i == 0){
                System.out.println(i);

            }
        }

     }
}