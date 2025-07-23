package basics;
/* 
    Reverse a number

    You are given an integer n. Return the integer formed by placing the digits of n in reverse order.

    Examples:
    Input: n = 25

    Output: 52

    Explanation: Reverse of 25 is 52.

    Input: n = 123

    Output: 321

    Explanation: Reverse of 123 is 321.
 */
public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1234;
        int newNum = 0;

        while(n > 0){
            int temp = n % 10; //extract last digit
            newNum = newNum * 10 + temp; // build reverser number
            n = n / 10; // remove the last digit
        }

        System.out.println(newNum);
    }
}
