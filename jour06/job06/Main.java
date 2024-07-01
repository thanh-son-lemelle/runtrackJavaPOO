package jour06.job06;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int j = 0;
        while (j<3){
            System.out.print("Enter number: ");
            myArray.add(scanner.nextInt());
            j++;
        }
        for (int i = 0; i < myArray.size(); i++) {
            if (myArray.get(i) > myArray.get(0)) {
                myArray.set(0, myArray.get(i));
            }
        }
        System.out.println("The highest number is: " + myArray.get(0));
    }
}
