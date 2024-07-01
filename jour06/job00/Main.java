package jour06.job00;
public class Main {
    public static void main(String[] args) {
        char myChar = 'D';
        String myString = "Hello";
        int myInt = 3;
        // myInt = 3.817; // Error: incompatible types: possible lossy conversion from double to int
        long myLong = 1000000000000000000L;
        float myFloat = 3.14f;
        boolean myBool = true;

        System.out.println(myChar);
        System.out.println(myString);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myBool);
    }
}
