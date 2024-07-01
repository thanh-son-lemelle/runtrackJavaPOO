package jour06.job07;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double moy = 0;
        Scanner scanner = new Scanner(System.in);
        int j = 0;
        while (j<5){
            System.out.print("Enter number: ");
            moy += scanner.nextInt();
            j++;
        }
        moy /= j;
        System.out.println("moyenne: " + moy);
    }
}
