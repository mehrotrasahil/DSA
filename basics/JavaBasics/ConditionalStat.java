package basics.JavaBasics;

import java.util.Scanner;

/* 
    Task
    Given an integer, , perform the following conditional actions:

    If  is odd, print Weird
    If  is even and in the inclusive range of 2 to 5, print Not Weird
    If  is even and in the inclusive range of 6 to 20, print Weird
    If  is even and greater than 20, print Not Weird
    Complete the stub code provided in your editor to print whether or not  is weird.
 */

public class ConditionalStat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if (num % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (num >= 2 && num <= 5) {
                System.out.println("Not Weird");
            } else if (num >= 6 && num <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }

        sc.close();
    }
}
