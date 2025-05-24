package basicQues;

public class Print1ToN {
    public static void main(String[] args) {
        int n = 10;
        print(n, 1);
    }

    private static void print(int num, int i){

        if(i > num) return;
        System.out.println(i++);
        print(num, i);
    }
    
}
