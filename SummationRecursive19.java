import java.util.Scanner;
public class SummationRecursive19 {
   
      public static int sumNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNumbers(n - 1);
    }
    public static void main(String[] args) {
        int n = 2; 
        int result = sumNumbers(n);
        System.out.println("Sum of numbers from 1 to " + n + ":");
        System.out.print("1");
        for (int i = 2; i <= n; i++) {
            System.out.print(" + " + i);
        }
        System.out.println(" = " + result);
    }

}

