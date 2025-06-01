package string;

public class LargestOddNumber {
    public static void main(String[] args) {
        String num = "52";
        System.out.println(largestString(num));
        
    }

    private static String largestString(String num){
     for(int i = num.length() - 1; i >= 0; i-- ){
            char c = num.charAt(i);

            int n = c - '0';
            if(n % 2 == 1){
                return num.substring(0 , i + 1);
            }
        }
        return "";    
    }

}
