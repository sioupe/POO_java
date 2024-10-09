package fr.diginamic.tpJ2.jeuDeLaVieConway.main;

import fr.diginamic.tpJ2.jeuDeLaVieConway.classe.Plateau;

public class Main {
    public static void main(String[] args) {
        Plateau plateau =new Plateau(10,10);
        plateau.setCellule(5,5,true);
        plateau.setCellule(4,5,true);
        plateau.setCellule(3,5,true);

        System.out.println(plateau);
        plateau.MAJPlateau();
        System.out.println(plateau);
        plateau.MAJPlateau();
        System.out.println(plateau);
        plateau.MAJPlateau();
        System.out.println(plateau);
    }
}
