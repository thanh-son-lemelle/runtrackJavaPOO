package jour07.job31;

import jour07.job34.Figure;

public class Cercle extends Figure{
    protected double rayon;

    public Cercle(double rayon, double x, double y) {
        super(x, y);
        this.rayon = rayon;
    }

    public void affiche() {
        System.out.println("Rayon : " + rayon + ", x : " + x + ", y : " + y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setCentre(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double surface() {
        return Math.PI * rayon * rayon;
    }

    public boolean estInterieur(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
}
