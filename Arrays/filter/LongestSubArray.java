package Arrays.filter;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/* *
 * Write code to find the largest continuous sequence in an array which sums to zero
 * input - [1, 2, -3, 3, -1, -2, 4]
 * output - [2,-3,1]
 * 
 */

public class LongestSubArray {
    public static void main(String[] atgs){
        List<Integer> nums = Arrays.asList(4, 2, -3, 1, 6);
        
        List<Integer> ans = getUpdatedList(nums);
        System.out.println(ans);
        
    }

    private static List<Integer> getUpdatedList(List<Integer> nums){
        List<Integer> ans = new ArrayList<>();
        for(var i = 0; i < nums.size(); i++){
            int temp = 0;
            List<Integer> tempList = new ArrayList<>();

            for(var j = i; j < nums.size(); j++){

                temp = temp + nums.get(j);
                tempList.add(nums.get(j));
                if(temp == 0){
                    if(tempList.size() > ans.size()){
                        ans = new ArrayList<>(tempList);
                        return ans;
                    }
                }
            }
        }
        return new ArrayList<>();
    }
}
