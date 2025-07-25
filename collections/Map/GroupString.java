package Map;
import java.util.*;
public class GroupString {
        public static void main(String[] args) {
     List<String> str = Arrays.asList("apple", "banana", "avocado", "bluberry");
     //Output: {a=[apple, avocado], b=[banana, blueberry]}
     
     
     Map<Character, List<String>> arr = new HashMap<>();

     for(String s : str){
       char ch = s.charAt(0);
       List<String> list = arr.getOrDefault(ch, new ArrayList<>());
       list.add(s);
       arr.put(ch, list);
     }
      System.out.println(arr);
  }
}
