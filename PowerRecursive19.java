import java.util.Scanner;
public class PowerRecursive19 {
    
    static String calculatePowerSeries(int base, int pow) {
        if (pow==0) {
            return "1"; 
        } else {
            String partialSeries = calculatePowerSeries(base, pow-1); 
            return base + "x" + partialSeries; 
        }
    }
    static int calculatePower(int base, int pow) {
        if (pow==0)
            return 1; 
        else
            return base*calculatePower(base, pow-1); 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input base number: ");
        int base = input.nextInt();
        System.out.print("Input power number: ");
        int power = input.nextInt();

        String series = calculatePowerSeries(base, power);
        System.out.println("Result of "+base+" power "+power+": "+series+" = "+calculatePower(base, power));
    }
    
    
}
