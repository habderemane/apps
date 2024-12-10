package entity;

import java.util.Scanner;

public class ChemiseImpl implements IChemise{
    private Scanner scanner = new Scanner(System.in);
    @Override
    public Chemise saisie() {
        Chemise chemise = new Chemise();
        System.out.println("Saisie d'une chemise");
        System.out.println("Entrer l'ID");
        chemise.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Entrer le libellé");
        chemise.setLib(scanner.nextLine());
        System.out.println("Entrer le type de couture");
        chemise.setCouture(scanner.nextLine());
        return chemise;
    }

    @Override
    public void affiche(Chemise c){
        System.out.println("Voici les details de la chemise");
        System.out.println("ID: " + c.getId());
        System.out.println("Libellé: " + c.getLib());
        System.out.println("Couture: " + c.getCouture());
    }
}
