package org.entites2;

import org.entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adresse ;

    public Personne(){
        this.nom="Guillen";
        this.prenom="Johan";
        this.adresse=new AdressePostale();
    }
    public Personne(String nom,String prenom){
        this.nom=nom;
        this.prenom=prenom;
        this.adresse=new AdressePostale();
    }
    public Personne(String nom,String prenom, AdressePostale adresse){
        this.nom=nom;
        this.prenom=prenom;
        this.adresse=new AdressePostale(adresse.numeroDeRue, adresse.codePostal, adresse.libelleRue, adresse.ville);
    }
}
