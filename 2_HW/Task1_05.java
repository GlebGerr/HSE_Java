import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        int[] arr = new int[n];
        int half = n / 2;
        
        for (int i = 0; i < half; i++) {
            arr[i] = i + 1;
        }
        for (int i = half; i < n; i++) {
            arr[i] = k;
        }
        
        int[] copy = arr.clone();
        Arrays.sort(copy);
        
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy));
        
        if (Arrays.equals(arr, copy)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}