/* 
 * Given an array and a number k where k is smaller than the size of the array, 
 * we need to find the k’th smallest element in the given array. It is given that all array elements are distinct.
 */

package Arrays;

import java.util.PriorityQueue;

public class KthElement {

    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        int arr[] = {5,2,1,6,10,11,20};
        int target = 3;

        /**
         * Below mentioned code is to find the kth largest element
         */

         for(int element : arr){
            minHeap.add(element);

            if(minHeap.size() > target){
                minHeap.poll();
            }
         }
         System.out.println(minHeap.peek());


        /**
         * Below mentioned code is to find the kth smallest element
         */
        // for(int num : arr){
        //     minHeap.add(num);
        // }

        // for(int i =0 ; i < target - 1; i++){
        //     minHeap.poll();
        // }
        
        // System.out.println(minHeap.poll());
        
    }
}
