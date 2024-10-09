package fr.diginamic.sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> setString = new HashSet<String>();
        Collections.addAll(setString,"USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde");
        Iterator<String> anIterator=setString.iterator();
        String nomPaysPlusLong="";
        while (anIterator.hasNext()){
            String tampon="";
            tampon=anIterator.next();
            System.out.println(tampon);
            if (tampon.length()> nomPaysPlusLong.length()) {
                nomPaysPlusLong=tampon;
            }
        }
        System.out.println("le pays au nom le plus long est : "+nomPaysPlusLong);
        setString.remove(nomPaysPlusLong);
        System.out.println(setString);
    }
}
