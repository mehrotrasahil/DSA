/* *
 *Search in Rotated Sorted Array
Medium
Topics
Companies
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
 
 */

 class Solution{

    public static int findTarget(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;
        

        while(left < right){
            int mid = (left + right) >> 1;


            System.out.println("inside while loop ");

            if(arr[mid] == target){
                System.out.println("inside 1st if ");

                return mid;
            }


            if(arr[left] <= arr[mid]){
               if(arr[left] <= target && target <= arr[mid]){
                    right = mid;
               }else{
                    left = mid + 1;
               }
            }else{
                if(arr[mid] <= target && target <= arr[right]){
                    left = mid + 1;
                }else{
                    right = mid;
                }
            }

        }

        return arr[left] == target ? left : -1;
    }
 }


 public class FindPivotInRotatedArray{
    public static void main(String[] args){
        int[] arr = new int[]{4,5,6,7,0,1,2,3};

        int target = 0;

        int result = Solution.findTarget(arr, target);
        System.out.println("position of given target: " + result);
    }
 }