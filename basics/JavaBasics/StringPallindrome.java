package JavaBasics;

/* 
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string s, print Yes if it is a palindrome, print No otherwise.
 */
public class StringPallindrome {
    public static void main(String[] args) {
        String s = "hello";
        boolean res = checkPallindrome(s);
        if(res){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    private static boolean checkPallindrome(String s){

        StringBuilder reverse = new StringBuilder();

        for(int i = s.length() - 1; i >= 0; i--){
            char ch = s.charAt(i);
            reverse.append(String.valueOf(ch));
        }

        return s.equals(reverse.toString()) ? true :false;
    }
}
