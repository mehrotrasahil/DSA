package basics.mathBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Divisors of a Number

You are given an integer n. You need to find all the divisors of n. Return all the divisors of n as an array or list in a sorted order.

A number which completely divides another number is called it's divisor.


Examples:
Input: n = 6

Output = [1, 2, 3, 6]

Explanation: The divisors of 6 are 1, 2, 3, 6.

Input: n = 8

Output: [1, 2, 4, 8]

Explanation: The divisors of 8 are 1, 2, 4, 8.


 */
public class Divisors{
    public static void main(String[] args) {
        int n = 6;
        List<Integer> num = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                num.add(i);
            }
        }

        System.out.println(Arrays.asList(num));
    }
}