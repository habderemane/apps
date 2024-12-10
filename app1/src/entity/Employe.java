package entity;

import java.util.Scanner;

public class Employe extends Personne implements IPersonne {
    private String fonction;
    private int salaire;

    public Employe() {
    }

    public Employe(String nom, String prenom, String fonction, int salaire) {
        super(nom, prenom);
        this.fonction = fonction;
        this.salaire = salaire;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public void saisie() {
        super.saisie();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la fonction : ");
        this.fonction = scanner.nextLine();
        System.out.print("Entrez le salaire : ");
        this.salaire = scanner.nextInt();
    }

    @Override
    public void affiche() {
        System.out.println("Employé :");
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Fonction : " + fonction);
        System.out.println("Salaire : " + salaire);
    }
}
