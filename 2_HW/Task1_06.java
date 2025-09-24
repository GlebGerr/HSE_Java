import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
        }
        
        System.out.println(sum);
        
        scanner.close();
    }
}