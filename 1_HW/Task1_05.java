import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        int digit1 = number / 1000;
        int digit2 = (number / 100) % 10;
        int digit3 = (number / 10) % 10;
        int digit4 = number % 10;
        
        if (digit1 == digit4 && digit2 == digit3) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
        
        scanner.close();
    }
}