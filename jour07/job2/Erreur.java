package jour07.job2;

public class Erreur {
    public static void main(String[] args) {
        E1 X = new E1();
        E2 Y = new E2();
        E3 Z = new E3();
        E4 V = new E4();
        E5 W = new E5();
        System.out.println(X.a);
        System.out.println(Y.b);//Erreur car c n'est pas un attribut de E2, E2 a comme attributs a et b
        System.out.println(Z.b);
        System.out.println(V.d);//Erreur car c n'est pas un attribut de E4, E4 a comme attributs a et d
        System.out.println(W.a);
    }
}

class E1 {
    int a = 1;
}

class E2 extends E1{
    int b = 2;
}

class E3 extends E2{
    int c = 3;
}

class E4 extends E1{
    int d = 4;
}

class E5 extends E4 {
    int e = 5;
}