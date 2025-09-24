import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int k = scanner.nextInt();
        k = k % n;
        
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            result[i] = arr[(i + k) % n];
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        
        scanner.close();
    }
}