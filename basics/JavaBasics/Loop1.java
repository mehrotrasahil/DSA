package basics.JavaBasics;

import java.util.Scanner;

/* 
Task
    Given an integer, N, print its first 10 multiples.
 */
public class Loop1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num * i );
        }

        sc.close();
    }
}