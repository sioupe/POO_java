package fr.diginamic.tpJ2.jeuDeLaVieConway.main;

import fr.diginamic.tpJ2.jeuDeLaVieConway.classe.Plateau;

public class Main {
    public static void main(String[] args) {
        Plateau plateau =new Plateau(10,10);
        plateau.getCellule(5,5).setEtat(true);
        plateau.getCellule(4,5).setEtat(true);
        plateau.getCellule(3,5).setEtat(true);
        System.out.println(plateau);

    }
}
