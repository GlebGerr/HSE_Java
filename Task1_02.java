import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        
        long truncated = (long) (x * 1000);
        double result = truncated / 1000.0;
        
        System.out.println(String.format("%.3f", result).replace(',', '.'));
        
        scanner.close();
    }
}