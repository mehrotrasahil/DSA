package Map;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{2,14,18,22,22};
         Map<Integer, Integer> numMap = new HashMap<>();

        for(int num : nums){
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }
            System.out.println(numMap.toString());

        for(Map.Entry<Integer, Integer> entry : numMap.entrySet()){
            if(entry.getValue() > 1){
                System.out.println("true");
                break;
            }else{
                System.out.println("false");
                break;
            }
        }
    }
}
