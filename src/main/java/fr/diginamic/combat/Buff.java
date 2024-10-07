package fr.diginamic.combat;

public class Buff {
    String nom ;
    String effet;
    int tempEffet;

    public Buff(String nom, String effet, int tempEffet) {
        this.nom = nom;
        this.effet = effet;
        this.tempEffet = tempEffet;
    }

    public String getNom() {
        return nom;
    }


    public String getEffet() {
        return effet;
    }


    public int getTempEffet() {
        return tempEffet;
    }

    public void setTempEffet(int tempEffet) {
        this.tempEffet = tempEffet;
    }
}
