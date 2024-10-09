package fr.diginamic.sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> setDouble = new HashSet<Double>();
        Collections.addAll(setDouble,1.5,8.25,-7.32,13.3,-12.45,48.5,0.01);
        System.out.println(setDouble);
        double max = Double.MIN_VALUE;


        Iterator<Double> anIterator=setDouble.iterator();
        while (anIterator.hasNext()){
            double tampon=0;
            if (( tampon = anIterator.next())>max){
                max=tampon;
            }

        }
        System.out.println("max = "+max);
        double min = Double.MAX_VALUE;
        anIterator=setDouble.iterator();
        while (anIterator.hasNext()){
            double tampon=0;
            if (( tampon = anIterator.next())<min){
                min=tampon;
            }

        }
        setDouble.remove(min);
        System.out.println("set apres suppression du min = "+setDouble);

    }
}
