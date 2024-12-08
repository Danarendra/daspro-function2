import java.util.Scanner;
public class PrimeCheckingRecursive19 {

    public static int isPrime(int n, int divisor) {
        if (n <= 1) {
            return 0; 
        }
        if (n == 2) {
            return 1; 
        }
        if (n % divisor == 0) {
            return 0; 
        }
        if (divisor * divisor > n) {
            return 1; 
        }
        return isPrime(n, divisor + 1);
    }
    public static void main(String[] args) {
        int n = 17; 
        int result = isPrime(n, 2);
        if (result == 1) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}