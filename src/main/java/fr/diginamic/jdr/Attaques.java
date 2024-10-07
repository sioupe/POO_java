package fr.diginamic.jdr;

public class Attaques {
    static void coup(Entite entite1 ,Entite entite2){
        int degat;
        if ((degat=(entite1.taper() - entite2.taper()))>=0) {
            entite2.setSante(degat);
        }else {
            entite1.setSante(degat);
        }
    }
}
