package fr.diginamic.tri;

public class Ville implements Comparable<Ville> {
    private String nom;
    private int nbHab;

    public Ville(Ville ville) {
        this.nom = ville.getNom();
        this.nbHab = ville.getNbHab();
    }
    public Ville(String nom, int nbHab) {
        this.nom = nom;
        this.nbHab = nbHab;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public Integer getNbHab() {
        return nbHab;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbHab=" + nbHab +
                "}\n";
    }

    @Override
    public int compareTo(Ville autre) {
        return this.getNbHab().compareTo(autre.getNbHab());
    }
}
