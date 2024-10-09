package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"Nice","Carcassone","Lyon","Foix","Pau","Marseille","Tarbes");
        System.out.println("liste : "+list);
        String plusGrandMot = "";
        for (String ville :list ) {
            if (ville.length()>plusGrandMot.length()){
                plusGrandMot=ville;
            }
        }
        System.out.println("le plus grand mot = "+plusGrandMot);
        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i).toUpperCase());
        }
        System.out.println("liste apres majuscule : "+list);

        list.removeIf(s -> (s.charAt(0) == 'N'));
        System.out.println(list);
    }

}
