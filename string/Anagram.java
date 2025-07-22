package string;

import java.util.Arrays;

/* An anagram is a word or phrase formed by rearranging the letters of another word or phrase, 
    using all the original letters exactly once. 

    input - String s1 = "Listen";
        String s2 = "siLent";
    
        output - "anagram"
*/
public class Anagram {
    
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "siLent";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("anagram");
        }
    }
    
    /* 
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "siLent";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if(s1.length() != s2.length()){
            System.out.println("No an anagram");
        }
        Map<Character, Integer> s1FreMap = new HashMap<>();
        Map<Character, Integer> s2FreMap = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            s1FreMap.put(s1.charAt(i), s1FreMap.getOrDefault(s1.charAt(i), 0) + 1);
        }

        
        for(int i = 0; i < s2.length(); i++){
            s2FreMap.put(s2.charAt(i), s2FreMap.getOrDefault(s2.charAt(i), 0) + 1);
        }

        if(s1FreMap.equals(s2FreMap)){
            System.out.println("Anagram");
        }
    } */
}
