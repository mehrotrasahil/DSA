package BinarySearch;

public class OccurrenceInArray {

    public static int firstOcc(int[] arr, int start, int end, int target){
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                ans = mid;
                end = mid - 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return ans;
    }

    public static int lastOcc(int[] arr, int start, int end, int target){
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                ans = mid;
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,6,6,6,7,8,9};
        int start = 0;
        int end = arr.length-1;
        int target = 6;

        int first = firstOcc(arr,start, end, target);
        int last = lastOcc(arr,start,end,target);
        System.out.println("first occurrence of target value is: " + first);
        System.out.println("Last occurrence of target value is: " + last);

        int result = (last - first) + 1;
        System.out.println("Total number of occurrence of "+target+" is : " + result);


    }
}
