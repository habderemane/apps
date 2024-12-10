package entity;

import java.util.Scanner;

public class ArticleImpl implements IArticle{
    private Scanner scanner = new Scanner(System.in);
    @Override
    public Article saisie() {
        Article article = new Article();
        System.out.println("Saisie d'un article");
        System.out.println("Entrer l'ID");
        article.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Entrer le libellé");
        article.setLib(scanner.nextLine());
        return article;
    }

    @Override
    public void affiche(Article a) {
        System.out.println("Voici les details de l'article");
        System.out.println("ID: " + a.getId());
        System.out.println("Libellé: " + a.getLib());
    }
}
