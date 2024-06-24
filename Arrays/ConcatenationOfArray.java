/* 
Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1] 
*/

package Arrays;

class Concatenate{
    public static int[] getConcatenation(int[] nums){
        int n = nums.length;
        int[] ans = new int[n*2];
        
        for(int i = 0; i < n; i++){
            ans[i] = nums[i]; // Copy each element of nums to the beginning of ans
            ans[i+n] = nums[i]; // Copy each element of nums again to the second half of ans
        }
        return ans;
    }
}



public class ConcatenationOfArray{
    public static void main(String[] args){
        int[] arr = new int[] {1,2,3,5};
        int[] res = Concatenate.getConcatenation(arr);
        System.out.print("[");
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i]);

        }
        System.out.print("]");

    }
}