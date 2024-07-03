package jour07.job40;

import java.time.LocalDate;

public class GestionVehicules {
    protected String marque;
    protected int dateAchat;
    protected double prixAchat;
    protected double prixCourant;
    
    // Constructeur
    public GestionVehicules(String marque, int dateAchat, double prixAchat) {
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prixAchat = prixAchat;
        this.prixCourant = prixAchat; // Initialement égal au prix d'achat
    }
    
    // Méthode pour afficher les informations
    public void affiche() {
        System.out.println("Marque: " + marque);
        System.out.println("Date d'achat: " + dateAchat);
        System.out.println("Prix d'achat: " + prixAchat);
        System.out.println("Prix courant: " + prixCourant);
    }
    
    // Méthode pour calculer le prix courant
    public void calculePrix(int anneeActuelle) {
       int annees = anneeActuelle - dateAchat;
       this.prixCourant = this.prixAchat - (this.prixAchat * 0.01 * annees);
        if (this.prixCourant < 0) this.prixCourant = 0;
    }
}

