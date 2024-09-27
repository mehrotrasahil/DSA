package BinarySearch;

public class BinarySearchAlgo {

    public static int findTheElement(int[] input, int end, int target){
        int result = 0;
        int start = 0;
        
        while (start < end) {
            
            int mid = start + (end - start) / 2;

            if(input[mid] == target){
                return mid;
            }
            
            if(target < input[mid]){
                end = mid -1;
            }else{
                start = mid;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4,5,6,7,8,9,10};
        int length = input.length-1;
        int target = 9;
    
        int result = findTheElement(input,length,target);
        System.out.println("index of the target element: " + result);
    }
  
    
}
