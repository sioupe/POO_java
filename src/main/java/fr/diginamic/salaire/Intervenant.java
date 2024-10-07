package fr.diginamic.salaire;

public abstract class Intervenant {
    private String nom;
    private String prénom;

    public Intervenant(String nom, String prénom) {
        this.nom = nom;
        this.prénom = prénom;
    }

    public abstract float getSalaire();
}
