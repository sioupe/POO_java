package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
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

    }
}
