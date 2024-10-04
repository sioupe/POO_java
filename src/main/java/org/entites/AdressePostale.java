package org.entites;

public class AdressePostale {
    public int numeroDeRue;
    public String libelleRue;
    public int codePostal;
    public String ville;

    public AdressePostale(){
        this.ville="Castries";
        this.codePostal=34160;
        this.libelleRue ="Michel Legrand";
        this.numeroDeRue=54;
    }

    public AdressePostale(int numeroDeRue, int codePostal,String libelleRue, String ville){
        this.ville=ville;
        this.numeroDeRue=numeroDeRue;
        this.codePostal=codePostal;
        this.libelleRue=libelleRue;
    }

}
