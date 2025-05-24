package basicQues;

public class Palindrome {

    /* *
     * Problem Statement: Given an integer N, return true if it is a palindrome else return false.
     * A palindrome is a number that reads the same backward as forward. For example, 121, 1331, and 4554 
     * are palindromes because they remain the same when their digits are reversed.
     */

     public static void main(String[] args) {
        int num = 4554;
        int dup = num;
        int rev = 0;

        while(num > 0){
            int temp = num % 10;

            rev = (rev * 10) + temp;

            num = num / 10;
             
        }
        if(dup == rev){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

     }
    
}
