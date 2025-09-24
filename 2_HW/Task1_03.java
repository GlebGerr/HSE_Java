import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                result[i] = arr[i + 1] - arr[i];
            } else if (i == n - 1) {
                result[i] = arr[i] - arr[i - 1];
            } else {
                result[i] = arr[i + 1] - arr[i - 1];
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        
        scanner.close();
    }
