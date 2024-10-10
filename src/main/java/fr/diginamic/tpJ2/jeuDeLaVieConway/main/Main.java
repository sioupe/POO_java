package fr.diginamic.tpJ2.jeuDeLaVieConway.main;

import fr.diginamic.tpJ2.jeuDeLaVieConway.classe.Plateau;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Plateau plateau =new Plateau(10,10);
        plateau.setCellule(5,5,true);
        plateau.setCellule(4,5,true);
        plateau.setCellule(3,5,true);
        plateau.setCellule(0,1,true);
        plateau.setCellule(9,9,true);

        Scanner scanner =new Scanner(System.in);
        while (scanner.nextInt()!=0){
        System.out.println(plateau);
        plateau.MAJPlateau();

        }
        return;
    }
}
