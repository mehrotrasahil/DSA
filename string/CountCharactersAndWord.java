package string;

import java.util.*;

public class CountCharactersAndWord {
    public static void main(String[] args) {

        /* Count character in a string */
        String str = "i.like.this.program.very.much";
        Map<Character, Integer> charCount = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == '.'){
                continue;
            }
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : charCount.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " : " + entry.getValue());

            }
        }


        /* Word Count */
        String[] arrStr = str.split("\\.");
        Map<String, Integer> countWord = new HashMap<>();

        for(int i = 0; i < arrStr.length; i++){
            countWord.put(arrStr[i], countWord.getOrDefault(arrStr[i], 0) + 1);
        }

        System.out.println(countWord);

    }
}
