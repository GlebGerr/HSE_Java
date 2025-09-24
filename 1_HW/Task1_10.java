import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vasya = scanner.nextInt();
        int petya = scanner.nextInt();
        
        if (vasya > petya) {
            System.out.println("Vasya");
        } else if (petya > vasya) {
            System.out.println("Petya");
        } else {
            System.out.println("Same");
        }
        
        scanner.close();
    }
}