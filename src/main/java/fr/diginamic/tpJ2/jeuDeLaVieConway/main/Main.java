package fr.diginamic.tpJ2.jeuDeLaVieConway.main;

import fr.diginamic.tpJ2.jeuDeLaVieConway.classe.Plateau;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);



        int choix =0;
        do {
            afficherMenu();

            String choixMenu = scanner.nextLine();

            choix = Integer.parseInt(choixMenu);
            switch (choix){
                case 1 :
                    Plateau plateau =new Plateau(10,10);
                    plateau.setCellule(5,5,true);
                    plateau.setCellule(4,5,true);
                    plateau.setCellule(3,5,true);
                    plateau.setCellule(3,1,true);
                    plateau.setCellule(4,1,true);
                    plateau.setCellule(5,1,true);
                    plateau.setCellule(0,1,true);
                    plateau.setCellule(9,9,true);
                    while (true) {
                        System.out.println("ecrire 0 pour mettre fin a l'execution");
                        System.out.println(plateau);
                        plateau.MAJPlateau();
                        try {
                            // faire une pause de 10 seconds
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                case 2 :
                    Plateau plateauPerso =new Plateau(scanner.nextLine());
                    while (true) {
                        System.out.println("ecrire 0 pour mettre fin a l'execution");
                        System.out.println(plateauPerso);
                        plateauPerso.MAJPlateau();
                        try {
                            // faire une pause de 10 seconds
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
            }
        }while (choix !=99);



        return;
    }

    private static void afficherMenu() {
        System.out.println("***** Menu du jeu de la vie *****");
        System.out.println("1. Lancer une partie avec un motif fixe");
        System.out.println("2. choisir son motif en écrivant son chemin");
        System.out.println("99. Sortir");
    }

}
