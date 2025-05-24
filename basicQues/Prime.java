 package basicQues;

public class Prime {
    /* *
     * Problem Statement: Given an integer N, check whether it is prime or not. 
     * A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2.
     */


     public static void main(String[] args) {
        int num = 5;
        
        int count = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

     }
}
 