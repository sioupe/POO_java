package fr.diginamic.entites2;

import fr.diginamic.entites.AdressePostale;

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

    public void setNom(String nom){
        this.nom=nom;
    }
    public void setAdresse(AdressePostale adresse){
        this.adresse.numeroDeRue=adresse.numeroDeRue;
        this.adresse.codePostal=adresse.codePostal;
        this.adresse.ville=adresse.ville;
        this.adresse.libelleRue=adresse.libelleRue;
    }

    public void affichage(){
        System.out.println("prénom : "+ this.prenom+ " nom : "+this.nom.toUpperCase());
    }
}
