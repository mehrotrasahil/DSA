package BinarySearch;

public class SortedRotatedArray {

    public static int  findTheElementInArray(int[] arr, int start, int end, int target){
        
        while (start < end) {
            
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && target < arr[mid]) {
                    end = mid - 1; 
                } else {
                    start = mid + 1; 
                }
            } 
            else {
                
                if (arr[mid] < target && target <= arr[end]) {
                    start = mid + 1; 
                } else {
                    end = mid - 1;  
                }
            }

        }
        return start - 1;

    }

    public static void main(String[] args) {
        int[] input = new int[]{4,5,6,8,9,2,3};
        int length = input.length - 1;
        int start = 0;
        int target = 4;
        int result = findTheElementInArray(input, start, length, target);

        System.out.println("pivot at index : " + result);
    }
    
}
