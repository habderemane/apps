package entity;

import java.util.Scanner;

public class Etudiant extends Personne implements IPersonne{
    private String matricule;
    private double moyenne;

    public Etudiant() {
    }

    public Etudiant(String nom, String prenom, String matricule, double moyenne) {
        super(nom, prenom);
        this.matricule = matricule;
        this.moyenne = moyenne;
        this.matricule = generateMatricule();
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }
    private String generateMatricule(){
        return "Etu" + System.currentTimeMillis();
    }

    @Override
    public void saisie() {
        super.saisie();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la moyenne : ");
        this.moyenne = scanner.nextDouble();
        this.matricule = generateMatricule();


    }

    @Override
    public void affiche() {
        System.out.println("Étudiant :");
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Matricule : " + matricule);
        System.out.println("Moyenne : " + moyenne);
    }
}
