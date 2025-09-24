import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int nextOdd = n + 1 + (n % 2);
        
        System.out.println(nextOdd);
        
        scanner.close();
    }
}