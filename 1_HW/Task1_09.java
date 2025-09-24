import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        boolean first = true;
        for (int i = 2; i <= n; i += 2) {
            if (!first) {
                System.out.print(" ");
            }
            System.out.print(i);
            first = false;
        }
        
        scanner.close();
    }
}