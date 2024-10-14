package fr.diginamic.listes;

import java.util.Objects;

public class Ville {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ville ville)) return false;
        return nbHab == ville.nbHab && Objects.equals(nom, ville.nom);
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public int getNbHab() {
        return nbHab;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbHab=" + nbHab +
                "}\n";
    }
}
