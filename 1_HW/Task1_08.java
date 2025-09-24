import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        int totalPeople = n + 1;
        int piecesPerPerson = k / totalPeople;
        
        System.out.println(piecesPerPerson);
        
        scanner.close();
    }
}