package JavaBasics;

/* 
Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. 
For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
 */

 import java.util.*;
public class StringAnagram {
    public static void main(String[] args) {
        String a = "anagram";
        String b = "margana";

        Map<Character, Integer> stringAFreq = new HashMap<>();
        Map<Character, Integer> stringBFreq = new HashMap<>();

        for(int i = 0; i < a.length(); i++){
            stringAFreq.put(a.charAt(i), stringAFreq.getOrDefault(a.charAt(i), 0) + 1);
        }

        
        for(int i = 0; i < b.length(); i++){
            stringBFreq.put(b.charAt(i), stringBFreq.getOrDefault(b.charAt(i), 0) + 1);
        }

        if(stringAFreq.equals(stringBFreq)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    
}
