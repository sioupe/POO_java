package fr.diginamic.chaines;

import static fr.diginamic.chaines.StringUtils.append;
public class TestStringBuilder {
    public static void main(String[] args) {
        int age=15;
        String nom ="Jean";
        long debut = System.currentTimeMillis();
        String stringBuild="";
        for (int i = 1; i <= 100000; i++) {
            stringBuild=stringBuild+ Integer.toString(i);
        }
        long fin = System.currentTimeMillis();
        System.out.println("Temps ecoules en millisecondes : " +(fin-debut));

        long debut2 = System.currentTimeMillis();
        String stringBuild2 ="";
        for (int i = 1; i <= 100000; i++) {
            stringBuild2.concat(Integer.toString(i));
        }
        long fin2 = System.currentTimeMillis();
        System.out.println("Temps ecoules en millisecondes : " +(fin2-debut2));
        System.out.println(append("le nom est ",nom," et son age c'est ",age));
    }
}
