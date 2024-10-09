package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,-1,5,7,3,-2,4,8,5);

        System.out.println("la liste : "+list);
        System.out.println("taille de list = "+list.size());

        int max = list.get(0);
        for (Integer val :list ) {
            if (val > max) {
                max=val;
            };
        }
        System.out.println("val max de list = "+max);


        int min = list.get(0);
        for (Integer val :list ) {
            if (val < min) {
                min=val;
            };
        }
        list.remove(list.indexOf(min));
        System.out.println("liste apres suppression du min :"+list);

        for (Integer val :list ) {
            if (val < 0) {
                val=list.set(list.indexOf(val),val*(-1));
            }
        }
        System.out.println("liste apres convertion des negatifs : "+list);


    }
}
