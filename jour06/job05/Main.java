package jour06.job05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.println("number "+number + "square number: " + Math.pow(number, 2));
        scanner.close();
    }    
}
