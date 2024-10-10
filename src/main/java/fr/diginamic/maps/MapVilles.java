package fr.diginamic.maps;

import fr.diginamic.listes.Ville;

import java.util.*;

public class MapVilles {
    public static void main(String[] args) {
        HashMap<String,Ville> mapVilles = new HashMap<String,Ville>();
        List<Ville> listVille= new ArrayList<>();
        Collections.addAll(listVille,new Ville("Nice",343000),new Ville("Carcassonne",47800),new Ville("Narbonne",53400),new Ville("Lyon",484000),new Ville("Foix",9700),new Ville("Pau",77200),new Ville("Marseille",850700),new Ville("Tarbes",40600));
        for (Ville ville :listVille ) {
            mapVilles.put(ville.getNom(), ville);
        }
        Ville villeNbHabMin = new Ville("",Integer.MAX_VALUE);
        for (Ville  ville: mapVilles.values() ) {
            if ( ville.getNbHab()<villeNbHabMin.getNbHab()) {
                villeNbHabMin=ville;
            }
        }
        mapVilles.remove(villeNbHabMin.getNom());
        System.out.println(mapVilles);
    }
}
