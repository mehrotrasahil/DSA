package string;

public class ReverseString {

    public static void main(String[] args) {
        String s = "GeeksQAEd";
        StringBuffer result = new StringBuffer();
        // result.reverse();
        // System.out.println(result.toString());

        for(int i = s.length() -1; i >= 0; i--){
            result.append(s.charAt(i));
        }

        System.out.println(result.toString());
    }

    
}
