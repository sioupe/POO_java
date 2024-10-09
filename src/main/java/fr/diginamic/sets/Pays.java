package fr.diginamic.sets;

public class Pays {
    private String nom;
    private  long nbHab ;
    private  double PIBHab ;


    public Pays(Pays pays) {
        this.nom = pays.getNom();
        this.PIBHab = pays.PIBHab;
        this.nbHab = pays.nbHab;
    }
    public Pays(String nom, double PIBHab, long nbHab) {
        this.nom = nom;
        this.PIBHab = PIBHab;
        this.nbHab = nbHab;
    }

    public String getNom() {
        return nom;
    }

    public long getNbHab() {
        return nbHab;
    }

    public double getPIBHab() {
        return PIBHab;
    }
}
