package fr.diginamic.listes;

import java.util.ArrayList;

public class CreationListes {
    public static void main(String[] args) {
        ArrayList<Integer> liste =new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            liste.add(i+1);
        }
        System.out.println("taille de liste = "+liste.size());
    }
}
