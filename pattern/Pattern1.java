package pattern;

public class Pattern1 {
    public static void main(String[] args) {
        /*
        Input - 3
        Output - * * *
                 * * *
                 * * *
        */
        int num = 5;
        
        for(int i = 0; i < num; i++){
            System.out.println();
            for(int j = 0; j < num; j++){
              System.out.print(" * ");
            }
        }
    }
}
