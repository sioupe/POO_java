package fr.diginamic.fichier;

public class Ville {
    private String nom;
    private int codeDepartement;
    private String nomRegion;
    private long PopTotal;

    public Ville(String nom, int codeDepartement, String nomRegion, long popTotal) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.PopTotal = popTotal;
    }
}
