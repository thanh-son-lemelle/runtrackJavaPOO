package jour07.job1;

public class Toto {
    static int toto = 0;
    Toto() {
        toto = toto + 1;
    }
    public static void main(String[] args) {
        Toto t1 = new Toto();
        Toto t2 = new Toto();
        System.out.println("Toto : " + toto);
    }
}
