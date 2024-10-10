package fr.diginamic.maps;

public class Pays {
    private String nom;
    private int nbHab;
    private String continent;

    public Pays(String nom, int nbHab, String continent) {
        this.nom = nom;
        this.nbHab = nbHab;
        this.continent = continent;
    }

    public String getContinent() {
        return continent;
    }
}
