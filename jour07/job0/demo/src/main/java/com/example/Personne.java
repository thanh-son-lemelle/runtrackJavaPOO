package com.example;
public class Personne {
    /*
     * Attributs publics, protégés et privés : Les attributs publics sont accessibles depuis n'importe où, 
     * les protégés sont accessibles dans la même classe et les sous-classes, 
     * et les privés uniquement dans la classe.
     * Getters et setters : Utilisés pour accéder et modifier les attributs privés de manière contrôlée.
     */
    // Attributs publics
    public String nom;
    public String prenom;
    // Attributs protégés
    protected String dateNaissance;
    protected String lieuNaissance;
    // Attributs privés
    private String adresse;
    private String telephone;

    // Constructeur
    public Personne(String nom, String prenom, String dateNaissance, String lieuNaissance, String adresse, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    // Getters et setters pour les attributs privés
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    // Méthode pour afficher les informations
    public void afficherInfos() {
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Date de Naissance: " + dateNaissance);
        System.out.println("Lieu de Naissance: " + lieuNaissance);
        System.out.println("Adresse: " + adresse);
        System.out.println("Téléphone: " + telephone);
    }
}