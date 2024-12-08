import java.util.Scanner;
public class DescendingSequenceRecursive19 {
    
    public static void displayNumbersRecursive(int n) {
        if (n < 0) {
            return;
        }
        System.out.print(n + " ");
        displayNumbersRecursive(n - 1);
    }
    public static void displayNumbersIterative(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Recursive approach:");
        displayNumbersRecursive(n);
        System.out.println("\nIterative approach:");
        displayNumbersIterative(n);
    }
}
