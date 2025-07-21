package JavaBasics;

/* 
Given a string, s, and an integer, k, complete the function so that it finds the lexicographically smallest and largest 
substrings of length .

Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

string s: a string
int k: the length of the substrings to find
 */

public class SubStringCompare {
    public static void main(String[] args) {
        String str = "welcometojava";
        int k = 3;

        String res = getSmallestAndLargest(str, k);
        System.out.println(res);
    }

    private static String getSmallestAndLargest(String s, int k){
            String smallest = s.substring(0, k);
            String largest = s.substring(0, k);

            for(int i = 0; i <= s.length() - k; i++){
                String temp = s.substring(i, i + k);
                if(temp.compareTo(smallest) < 0) smallest = temp;
                if(temp.compareTo(largest) > 0) largest = temp;
            }



        return smallest + "\n" + largest;
    }
}
