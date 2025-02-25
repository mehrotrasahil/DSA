package string;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";

        String[] arrWords = str.split("");
        
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = arrWords.length -1; i >= 0; i--){

            String data = arrWords[i];
            stringBuffer.append(data);

        }
        System.out.print(stringBuffer.toString());
    }
}
    

