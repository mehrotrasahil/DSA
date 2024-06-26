/* 
1672. Richest Customer Wealth
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
 */

 /* 
  Optimal solution
  */

package Arrays;

class Solution{
    public static int maximumWealth(int[][] accounts) {
        // Initialize a variable to keep track of the maximum wealth found so far.
        int wealth = 0;

        // Loop through each customer's accounts.
        for(int[] row : accounts){

            // Initialize a variable to accumulate the wealth of the current customer.
            int countArr = 0;

            // Loop through each bank account of the current customer and sum their wealth.
            for(int money : row){
                countArr += money;
            }
            // Update maxWealth if the current customer's wealth is greater.
            wealth = Math.max(countArr, wealth);
        }        
        return wealth;
    }
}


/* 
 Brute Force Approach
 */
/* class Solution {
    public static int maximumWealth(int[][] accounts) {
        // Initialize a variable to keep track of the maximum wealth found so far.
        int wealth = 0;
        
        // Get the number of customers (rows in the 2D array).
        int m = accounts.length;
        
        // Loop through each customer.
        for (int i = 0; i < m; i++) {
            // Initialize a variable to accumulate the wealth of the current customer.
            int countArr = 0;
            
            // Get the number of banks (columns in the 2D array for the current customer).
            int n = accounts[i].length;
            
            // Loop through each bank account of the current customer.
            for (int j = 0; j < n; j++) {
                // Add the amount of money in the current bank account to the customer's total wealth.
                countArr += accounts[i][j];
            }
            
            // After calculating the total wealth for the current customer,
            // compare it with the maximum wealth found so far.
            // If the current customer's wealth is greater, update the maximum wealth.
            if (countArr > wealth) {
                wealth = countArr;
            }
        }
        
        // After processing all customers, return the maximum wealth found.
        return wealth;
    }
} */

public class Wealth {
    public static void main(String[] args) {
       int[][] accounts = new int[][]{ { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
       int ans = Solution.maximumWealth(accounts);
       System.out.println(ans);
       
    }
}
