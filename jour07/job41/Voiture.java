package jour07.job41;

import jour07.job40.GestionVehicules;

public class Voiture extends GestionVehicules {

    private int cylindree;
    private int nbPortes;
    private int puissance;
    private int kilometrage;

    public Voiture(String marque, int dateAchat, double prixAchat, int cylindree, int nbPortes, int puissance, int kilometrage) {
        super(marque, dateAchat, prixAchat);
        this.cylindree = cylindree;
        this.nbPortes = nbPortes;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Cylindrée: " + cylindree + ", Nombre de portes: " + nbPortes +
                           ", Puissance: " + puissance + ", Kilométrage: " + kilometrage);
    }

    @Override
    public void calculePrix(int anneeActuelle) {
        super.calculePrix(anneeActuelle);
        int annees = anneeActuelle - dateAchat;
        this.prixCourant = this.prixAchat - (this.prixAchat * 0.02 * annees) - (this.prixAchat * 0.05 * (kilometrage / 10000));
        if (marque.equalsIgnoreCase("Renault") || marque.equalsIgnoreCase("Fiat")) {
            this.prixCourant -= this.prixAchat * 0.10;
        } else if (marque.equalsIgnoreCase("Ferrari") || marque.equalsIgnoreCase("Porsche")) {
            this.prixCourant += this.prixAchat * 0.20;
        }
        if (this.prixCourant < 0) this.prixCourant = 0;
    }
}
