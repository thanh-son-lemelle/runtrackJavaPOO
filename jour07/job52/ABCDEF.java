package jour07.job52;

import jour07.job50.*;


public class ABCDEF {
    public static void main(String[] args) {
        A[] as = { new A(1), new B(2), new C(3), new D(4), new E(5), new F(6), new B(7), new B(8) };
        rechercher(as, A.class);
        additionner(as, B.class);
    }

    public static void rechercher(A[] as, Class<?> instance) {
        int countInstance = 0;
        for (A a : as) {
            if (instance.isInstance(a)) {
                countInstance++;
            }
        }
        System.out.println("Il y a " + countInstance + " instances de la classe " + instance.getName() + " dans le tableau.");
    }

    public static void additionner(A[] as, Class<?> instance) {
        int sommeD = 0;
        for (A a : as) {
            sommeD += a.getD();
        }
        System.out.println("Somme des variables d : " + sommeD + " instances de la classe " + instance.getName() + " dans le tableau.");
    }
}