package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestVilles {
    public static void main(String[] args) {
        ArrayList<Ville> listVille = new ArrayList<Ville>();
        Collections.addAll(listVille,new Ville("Nice",343000),new Ville("Carcassonne",47800),new Ville("Narbonne",53400),new Ville("Lyon",484000),new Ville("Foix",9700),new Ville("Pau",77200),new Ville("Marseille",850700),new Ville("Tarbes",40600));
        System.out.println(listVille);
        Ville villePlusPeuple = new Ville(listVille.getFirst());
        for (Ville ville :listVille ) {
            if (ville.getNbHab() > villePlusPeuple.getNbHab()) {
                villePlusPeuple=ville;
            }
        }

        System.out.println("ville la plus peuplé = "+villePlusPeuple);

        Ville villeMoinsPeuple = new Ville(listVille.getFirst());
        for (Ville ville :listVille ) {
            if (ville.getNbHab() < villeMoinsPeuple.getNbHab()) {
                villeMoinsPeuple =ville;
            }
        }
        listVille.remove(villeMoinsPeuple);
        System.out.println(listVille);


        for (Ville ville :listVille ) {
            if (ville.getNbHab() > 100000) {
                ville.setNom(ville.getNom().toUpperCase());
            }
        }
        System.out.println(listVille);


    }
}
