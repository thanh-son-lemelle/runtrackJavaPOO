package jour07.job34;

import jour07.job31.Cercle;
import jour07.job30.Rectangle;
import jour07.job32.RectangleColore;

public class Main {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5, 0, 0);
        Cercle c = new Cercle(5, 0, 0);
        RectangleColore rc = new RectangleColore(0, 0, 10, 5, "rouge");

        System.out.println("Surface du rectangle : " + r.surface());
        System.out.println("Surface du cercle : " + c.surface());
        r.affiche();
        c.affiche();
        rc.affiche();
    }
}
