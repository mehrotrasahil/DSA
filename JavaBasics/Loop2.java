package JavaBasics;

import java.util.Scanner;

/* 
 Given integers a, b, and n, generate a sequence of n terms where each term is calculated 
 as a + b × (2^0 + 2^1 + ... + 2^j) for j from 0 to n-1.
*/
public class Loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int sum = a;
            for(int j = 0; j < n; j++){
                sum += (int) Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
