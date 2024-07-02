package jour07.job30;

import jour07.job34.Figure;

public class Rectangle extends Figure{
    protected double longueur;
    protected double largeur;

    public Rectangle(double longueur, double largeur, double x, double y) {
        super(x, y);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double surface() {
        return longueur * largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public void affiche() {
        System.out.println("Longueur : " + longueur + ", largeur : " + largeur + ", x : " + x + ", y : " + y);
    }

}
