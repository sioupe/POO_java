package fr.diginamic.jdr;

import java.util.Scanner;

public class Partie {
    public static void main(String[] args) {
        Perso perso = new Perso();
        Combat combat ;
        Entite monstre;
        while (perso.vivant()){
            combat=new Combat(perso,perso);

        };
    }
}
