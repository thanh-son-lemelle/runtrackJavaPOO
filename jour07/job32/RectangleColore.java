package jour07.job32;

import jour07.job30.Rectangle;

public class RectangleColore extends Rectangle {
    private String couleur;

    public RectangleColore(double x, double y, double longueur, double largeur, String couleur) {
        super(longueur, largeur, x, y);
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void affiche() {
        System.out.println("Longueur : " + longueur + ", largeur : " + largeur + ", x : " + x + ", y : " + y + ", couleur : " + couleur);
    }

}
