package fr.diginamic.jdr;

public abstract class  Potion {
    int valeur;
    String nom;

    public Potion(int valeur, String nom) {
        this.valeur = valeur;
        this.nom = nom;
    }
    public abstract void description();
    public int use(){
        return this.valeur;
    }

}
