package fr.diginamic.jdr;

import java.util.Scanner;

public class Combat {
    Scanner scanner = new Scanner(System.in);
    public boolean combat(Perso perso,Entite monstre){
        while (perso.vivant() && monstre.vivant()){
            switch (scanner.nextInt()){
                case 1:
                    this.coup(perso,monstre);
                    break;
                default:
                    System.out.println("oui y a pas d'autres choix pour le moment c'est en wip");

            }
            System.out.print("pv perso = "+perso.getSante()+ "| pv monstre = "+monstre.getSante());
        }


        return perso.vivant();
    }
    private void coup(Entite entite1 ,Entite entite2){
        int degat;
        if ((degat=(entite1.taper() - entite2.taper()))>=0) {
            entite2.setSante(degat);
        }else {
            entite1.setSante(degat);
        }
    }
}
