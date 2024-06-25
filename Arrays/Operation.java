/* 
 * 2011. Final Value of Variable After Performing Operations
There is a programming language with only four operations and one variable X:

++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.

Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
 */


package Arrays;

/*
 * This solution beats 100% 
 */

class Solution {
    public static int finalValueAfterOperations(String[] operations) {
               int ans = 0;
        for (String operation : operations) {
            /* Here, we check the character at a specific position. This is a simpler and faster operation compared to string comparison because it directly accesses the character array underlying the string. */
            if (operation.charAt(1) == '+') { 
                ans++;
            } else {
                ans--;
            }
        }
        return ans;
    }
}

/* 
 * This solution beats 79%
 */

/* class Solution {
    public static int finalValueAfterOperations(String[] operations) { 
        int ans = 0;
        if(operations.length <= 0){
            return ans;
        }
        for(String operation : operations){
            if(operation.equals("X++") || operation.equals("++X")){
                ans++;
            }else{
                ans--;
            }
        }
        return ans;
    }
} */

public class Operation {
    public static void main(String[] args) {
        String operations[] = new String[]{"X++","++X","--X","X--"};
        int result = Solution.finalValueAfterOperations(operations);

        System.out.println(result);
    }
    
}
