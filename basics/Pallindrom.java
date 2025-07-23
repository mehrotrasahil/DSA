package basics;
/* 
Palindrome Number
You are given an integer n. You need to check whether the number is a palindrome number or not. Return true if it's a palindrome number, otherwise return false.

A palindrome number is a number which reads the same both left to right and right to left.

Examples:
Input: n = 121

Output: true

Explanation: When read from left to right : 121.

When read from right to left : 121.

Input: n = 123

Output: false

Explanation: When read from left to right : 123.

When read from right to left : 321.
 */
public class Pallindrom {
    public static void main(String[] args) {
        int n = 12121;
        boolean isPallindrome = checkPallindrome(n);
        System.out.println(isPallindrome);
    }

    private static boolean checkPallindrome(int n){
        int copyOfN = n;
        int reverseNum = 0;

        while (n > 0) {
            int temp = n % 10;
            reverseNum = reverseNum * 10 + temp;
            n = n / 10;
        }

        if(reverseNum == copyOfN){
            return true;
        }
        return false;
    }
}
