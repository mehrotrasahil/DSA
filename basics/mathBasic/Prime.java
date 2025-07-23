package basics.mathBasic;

/* 
 Problem Statement: Given an integer N, check whether it is prime or not. A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2.

Examples
    Example 1:
    Input:N = 2
    
    Output:True
    
    Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).
                            
    Example 2:
    Input:N =10                
    
    Output: False
    
    Explanation: 10 is not prime, it is a composite number because it has 4 divisors: 1, 2, 5 and 10.                        
 */
public class Prime {
    public static void main(String[] args) {
        int n = 15;
        boolean isPrime = checkPrimeOptimized(n);
        System.out.println(isPrime);
       
    }

    private static boolean checkPrime(int n){
        if(n <= 1){
            return false;
        }
        if(n == 2 || n == 3){
            return true;
        }
        if(n % 2 == 0){
            return true;
        }

        int count = 0;

         for(int i = 1; i <= n; i++){
            int temp = n % i;
            if(temp == 0){
                count++;
            }
        }
        if(count == 2){
            return true;
        }
        return false;
    }

    private static boolean checkPrimeOptimized(int n){
        if (n <= 1) return false; // 0 and 1 are not prime numbers
        if (n == 2) return true;  // 2 is the only even prime number
        if (n % 2 == 0) return false; // eliminate even numbers

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
