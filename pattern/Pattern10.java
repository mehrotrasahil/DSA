package pattern;

/* 

input - n = 5
 * Output:

    1
   212
  23123
 2341234
234512345
 */
public class Pattern10 {
        public static void main(String[] args) {
      int n = 5;
      for(int i = 1; i <= n; i++){
        for(int j = n-1; j >= i; j--){
          System.out.print(" ");
        }
        
        for(int j = 2; j <= i; j++){
          System.out.print(j);
        }
        for(int j = 1; j <= i; j++){
          System.out.print(j);
        }
       
        System.out.println();
      }
  }
}
