package entity;

import java.util.Scanner;

public class Personne{
    protected String nom;
    protected String prenom;

    public Personne() {
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void saisie() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la référence du produit : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez le libellé du produit : ");
        String prenom = scanner.nextLine();

    }

}
