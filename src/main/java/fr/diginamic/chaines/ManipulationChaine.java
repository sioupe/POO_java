package fr.diginamic.chaines;

public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 0523.5";
        char premierCaractere = chaine.charAt(0);
        System.out.println("premier caractere: " + premierCaractere);
        System.out.println("taille chaine caractere : "+chaine.length() );
        System.out.println("premier index : "+chaine.indexOf(";"));
        System.out.println("premiere portion : "+chaine.substring(0,chaine.indexOf(";")));
        System.out.println("premiere portion : "+chaine.substring(0,chaine.indexOf(";")).toUpperCase());
        System.out.println("premiere portion : "+chaine.substring(0,chaine.indexOf(";")).toLowerCase());
        String[] tab = chaine.split(";");
        for(String mot: tab) {
            System.out.print(mot+" ");
        }
        System.out.print("\n");


    }

}
