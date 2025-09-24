import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        if (n <= 1) {
            System.out.print("");
        } else {
            for (int i = 1; i < n; i++) {
                if (arr[i] > arr[i - 1]) {
                    System.out.print("YES");
                } else {
                    System.out.print("NO");
                }
                if (i < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("!");
        }
        
        scanner.close();
    }
}