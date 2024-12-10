package entity;

import java.util.Scanner;

public class MontreImpl implements IMontre{
    Scanner scanner = new Scanner(System.in);
    @Override
    public Montre saisie() {
        Montre montre = new Montre();
        System.out.println("Saisie d'une montre");
        System.out.println("Entrer l'ID");
        montre.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Entrer le libellé");
        montre.setLib(scanner.nextLine());
        System.out.println("Entrer le type d'une nature");
        montre.setNature(scanner.nextLine());
        return montre;
    }

    @Override
    public void affiche(Montre m) {
        System.out.println("Voici les details de la montre");
        System.out.println("ID: " + m.getId());
        System.out.println("Libellé: " + m.getLib());
        System.out.println("Couture: " + m.getNature());
    }
}
