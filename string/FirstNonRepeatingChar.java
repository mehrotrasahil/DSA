package string;
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "abcdcaf aaa";
        char result = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int count = 0;

            for(int j = 0; j < str.length(); j++){
                if(i != j && ch == str.charAt(j)){
                    count++;
                }
            }
            if(count == 0){
                result = ch;
                break;
            }

        }

        if (result != 0) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
