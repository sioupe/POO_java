package fr.diginamic.jdr;

import java.util.Scanner;

public class Combat {
    private boolean resultat;

    public boolean isResultat() {
        return resultat;
    }

    public Combat(Perso perso,Entite monstre) {
        Scanner scanner = new Scanner(System.in);
        while (perso.vivant() && monstre.vivant()){
            switch (scanner.nextInt()){
                case 1:
                    Attaques.coup(perso,monstre);
                    break;
                default:
                    System.out.println("oui y a pas d'autres choix pour le moment c'est en wip");

            }
            System.out.print("pv perso = "+perso.getSante()+ "| pv monstre = "+monstre.getSante());
        }


        this.resultat=perso.vivant();
    }





}
