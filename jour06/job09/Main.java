package jour06.job09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number n: ");
        int n = scanner.nextInt();
        int sumOfCubes = 0;
        for (int i = 1; i <= n; i++) {
            sumOfCubes += i * i * i;
        }
        System.out.println("La somme des " + n + " premiers cubes est: " + sumOfCubes);
        
        scanner.close();
    }
}
