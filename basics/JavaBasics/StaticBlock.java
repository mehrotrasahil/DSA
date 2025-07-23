package basics.JavaBasics;

import java.util.Scanner;
/* 
Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with 
breadth  and height . You should read the variables from the standard input.


 */
public class StaticBlock {
    static{
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();
        
        if(b <= 0 || h <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else{
            System.out.println(b*h);
        }
        sc.close();
    }
}
