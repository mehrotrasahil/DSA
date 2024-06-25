/* 
1512. Number of Good Pairs
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 */

package Arrays;

import java.util.HashMap;
import java.util.Map;


/** 
 Optimized solution using HashMap getOrDefault method.
 The `getOrDefault` method in Java's `HashMap` class is a convenient way to retrieve a value associated with a key, with the option to provide a default value if the key does not exist in the map. This method helps avoid `null` values and provides a fallback value when the key is not found.
 */
class Solution{
    public static int findGoodPair(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int pair : nums){
            int count = map.getOrDefault(pair, 0) ;
            ans += count;
            map.put(pair, count + 1);
        }

        return ans;
    }
}


public class GoodPair {
    public static void main(String[] args) {
        int num[] = new int[]{1,2,3,1,1,3};
        int result = Solution.findGoodPair(num);

        System.out.println(result);
    }
    
}



/**
 * Brute force approach
 */

/* class Solution{
    public static int findGoodPair(int[] num){
        int ans = 0;
        if(num.length <= 0){
            return ans;
        }
        for(int i = 0; i < num.length; i++){
            for(int j = 1; j < num.length; j++){
              if(num[i] == num[j] && i < j){
                ans++;
              }
            }

        }

        return ans;
    }
} */


