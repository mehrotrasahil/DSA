package basics.recurssion;
/* 
 * Print 1 to N using Recursion


0

100
Easy

Given an integer n, write a function to print all numbers from 1 to n (inclusive) using recursion.

You must not use any loops such as for, while, or do-while.
The function should print each number on a separate line, in increasing order from 1 to n.

Examples:
Input: n = 5

Output:

1  

2  

3  

4  

5

Input: n = 1

Output:

1
 */

public class PrintNumbers {
    public static void main(String[] args) {
        int n = 5;

        printNumInLoop(1, n);
    }

    private static void printNumInLoop(int i, int n) {
        if (i > n)
            return;

        System.out.println(i);
        printNumInLoop(i + 1, n);
    }
}