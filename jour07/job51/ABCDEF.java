package jour07.job51;

import jour07.job50.*;


public class ABCDEF {
    public static void main(String[] args) {
        A[] as = { new A(1), new B(2), new C(3), new D(4), new E(5), new F(6), new B(7), new B(8) };
        rechercher(as, A.class);
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
}