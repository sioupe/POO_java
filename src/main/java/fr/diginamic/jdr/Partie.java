package fr.diginamic.jdr;

import java.util.Scanner;

public class Partie {
    public static void main(String[] args) {
        System.out.println("nouveau combat");
        Perso perso = new Perso();
        Combat combat ;
        Entite monstre = null;
        String[] listeMonstre ={"Loup","Gobelin","Troll"};
        while (perso.vivant()){
            switch ((int)(Math.random()*2)){
                case 0:
                    monstre =new Loup();
                case 1:
                    monstre = new Gobelin();
                case 2 :
                    monstre = new Troll();
            }
            combat=new Combat(perso,monstre);
            if (combat.isResultat()) {
                perso.setScore(monstre.getScore());
                System.out.println("score = "+perso.getScore());
            }
        };
    }
}
