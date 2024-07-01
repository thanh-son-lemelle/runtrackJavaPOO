package jour06.job10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.close();
        if (age < 18) {
            System.out.println("you are minor");
        } else {
            System.out.println("you are of legal age");
        }
        
    }
}
