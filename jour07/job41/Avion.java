package jour07.job41;

import jour07.job40.GestionVehicules;

public class Avion extends GestionVehicules {
    private String typeMoteur;
    private int heuresVol;

    public Avion(String marque, int dateAchat, double prixAchat, String typeMoteur, int heuresVol) {
        super(marque, dateAchat, prixAchat);
        this.typeMoteur = typeMoteur;
        this.heuresVol = heuresVol;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Type de moteur: " + typeMoteur + ", Heures de vol: " + heuresVol);
    }

    @Override
    public void calculePrix(int anneeActuelle) {
        super.calculePrix(anneeActuelle);
        if (typeMoteur.equalsIgnoreCase("HELICES")) {
            this.prixCourant -= this.prixAchat * 0.10 * (heuresVol / 100);
        } else {
            this.prixCourant -= this.prixAchat * 0.10 * (heuresVol / 1000);
        }
        if (this.prixCourant < 0) this.prixCourant = 0;
    }
}