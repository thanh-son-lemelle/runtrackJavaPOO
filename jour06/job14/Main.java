package jour06.job14;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Please enter a number between 0 and 9: ");
            n = scanner.nextInt();

            if (n <= 9) {
                validInput = true;
            } else {
                System.out.println("Number must be below or equal to 9. try again.");
            }
        }
        System.out.println("Table de multiplication de " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        scanner.close();
    }
}
