package fr.diginamic.listes;

public class TestEquals {
    public static void main(String[] args) {


        Ville ville1 = new Ville("Montpellier", 5);
        Ville ville2 = new Ville("Montpellier", 5);
        Ville ville3 = new Ville("Marseilles", 5);
        System.out.println(ville1.equals(ville2));
        System.out.println(ville1.equals(ville3));
        System.out.println(ville1==ville2);
    }
}
