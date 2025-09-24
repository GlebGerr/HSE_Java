import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        int[][] deepCopy = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            deepCopy[i] = matrix[i].clone();
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] % 2 == 0) {
                    matrix[i][j] = -matrix[i][j];
                }
            }
        }
        
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(deepCopy));
        
        scanner.close();
    }
}