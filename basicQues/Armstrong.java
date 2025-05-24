package basicQues;

public class Armstrong {
    /* *
     * Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.
     * An Armstrong number is a number that is equal to the sum of its own digits each raised to the power 
     * of the number of digits.
     * Example 1:
                Input:N = 153
               
                Output:True
                
                Explanation: 13+53+33 = 1 + 125 + 27 = 153
     */

     public static void main(String[] args) {
        int n = 153;

        int count = String.valueOf(n).length();
        int dup = n;
        int sum = 0;
/*         while(n > 0){
            count++;
            n = n / 10;
        }
        n = dup; */

        while(n > 0){
            int temp = n % 10;

            sum += Math.pow(temp, count);

            n = n / 10;
        }


        System.out.println(sum);
        System.out.println(dup);
        System.out.println(n);


     }
    
}
