package fr.diginamic.entites;

public class Theatre {
    private String nom;
    private int capaciteMax;
    private int nbClientInscrit;
    private float recetteTotale;

    public Theatre(String nom, int capaciteMax) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.nbClientInscrit = 0;
        this.recetteTotale = 0.0f;
    }

    public int getNbClientInscrit() {
        return nbClientInscrit;
    }

    public double getRecetteTotale() {
        return recetteTotale;
    }

    public boolean inscrire( int nbClient, float prix){
        if (nbClient+this.nbClientInscrit<=capaciteMax) {
            nbClientInscrit += nbClient;
            recetteTotale += prix*nbClient;
            return true;
        }else {
            System.out.println("Y a plus de place déso");
            return false;
        }

    }
}
