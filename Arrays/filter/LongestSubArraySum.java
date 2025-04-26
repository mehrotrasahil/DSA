package Arrays.filter;

import java.util.Arrays;
import java.util.List;

/* *
 * Write a code to find the Maximum sub array sum.
 * input - [2, 3, -8, 7, -1, 2, 3]
 * output - 21
 * Explanation - The sub array {7, -1, 2, 3} has the largest sum 11.
 */
public class LongestSubArraySum {
    public static void main (String[] args){
        List<Integer> nums = Arrays.asList(2, 3, -8, 7, -1, 2, 3);
        int sum = getTheMaxSumOptimized(nums);

        System.out.println("Max Sub Array Sum is: " + sum);
    }

    // Iterative approach
    private static int getTheMaxSum(List<Integer> nums){
        int result = 0;

        for(int i = 0; i < nums.size(); i++){
            int temp = 0;

            for(int j = i; j < nums.size(); j++){
                temp = temp + nums.get(j);

                if(temp > result){
                    result = temp;
                }
            }
        }
        return result;
    }

    // Optimized approach
    private static int getTheMaxSumOptimized(List<Integer> nums){
        int start = nums.get(0);
        int end = nums.get(0);

        for(int i = 1; i < nums.size(); i++){
            
            if(end + nums.get(i) > start){
                end = end + nums.get(i);
            }else{
                end = nums.get(i);
            }
        }
        
        if(end > start){
            start = end;
        }
        return start;
    }

}
