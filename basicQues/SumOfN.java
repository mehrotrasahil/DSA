package basicQues;

public class SumOfN {
    public static void main(String[] args) {
        int num = 6;
        int sumOfN = 0;
        int res = sum(num, 1, sumOfN);
        System.out.println(res);
    }

    private static int sum(int num, int i, int sumOfN){
        if(i > num){
            return sumOfN;
        }
        sumOfN +=  i++;
        return sum(num, i, sumOfN);
    }
}
