package basics.mathBasic;

/* 
Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.

An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

    Example 1:
    Input:N = 153

    Output:True

    Explanation: 13+53+33 = 1 + 125 + 27 = 153
                            
    Example 2:
    Input:N = 371                

    Output: True

    Explanation: 33+53+13 = 27 + 343 + 1 = 371
								
 */
public class Armstrong {
    public static void main(String[] args) {
        int n = 22;
        boolean isArmstrong = checkArmstrong(n);
        System.out.println(isArmstrong);
    }

    private static boolean checkArmstrong(int n){
        int copyNum = n;
        int armstrongNum = 0;

        while(n > 0){
            int temp = n % 10;
            int powNum = (int) Math.pow(temp, 3);
            armstrongNum = armstrongNum + powNum;
            n = n / 10; 
        }

        if(copyNum == armstrongNum){
            return true;
        }

        return false;
    }
}
