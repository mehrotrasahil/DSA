package string;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "a good   example";

        String[] arr = s.trim().split(" ");
        StringBuffer sb = new StringBuffer();

        for(int i = arr.length - 1; i >= 0; i--){
             if(arr[i].equals(" ")  || arr[i].equals("")){
                continue;
            }

            sb.append(arr[i]);
            if(i > 0){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());

        /* String[] arrWords = str.split("");
        
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = arrWords.length -1; i >= 0; i--){
            
            if(arrWords[i].equals(".")){
                continue;
            }
            String data = arrWords[i];
            stringBuffer.append(data);

        }
        System.out.print(stringBuffer.toString()); */
    }
}
    

