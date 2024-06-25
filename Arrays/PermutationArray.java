
package Arrays;


/**
 * Bruit force approach
*/

class permutation{
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}



public class PermutationArray { 
   public static void main (String[] args){
    int[] nums = new int[] {0,1,5,3,4,2};
    int[] result = permutation.buildArray(nums);
    for(int num : result){
        System.out.println(num);
    }
   }
}

