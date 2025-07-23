package basics.mathBasic;


/* 
GCD of Two Numbers
You are given two integers n1 and n2. You need find the Greatest Common Divisor (GCD) of the two given numbers. 
Return the GCD of the two numbers.

The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.


Examples:
Input: n1 = 4, n2 = 6

Output: 2

Explanation: Divisors of n1 = 1, 2, 4, Divisors of n2 = 1, 2, 3, 6

Greatest Common divisor = 2.

Input: n1 = 9, n2 = 8

Output: 1

Explanation: Divisors of n1 = 1, 3, 9 Divisors of n2 = 1, 2, 4, 8.

Greatest Common divisor = 1.
 */
public class GCD {
    public static void main(String[] args) {
        int n1 = 48;
        int n2 = 68;

        int res = getGCD(n1, n2);
        System.out.println(res);
    }

    private static int getGCD(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
