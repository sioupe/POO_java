package fr.diginamic.banque.entites;

public class Compte {
    private int numCompte;
    private float soldeCompte;

    public Compte(){
        this.numCompte=0;
        this.soldeCompte = 0.0f;
    }
    public Compte(int numCompte,float soldeCompte){

        this.numCompte=numCompte;
        this.soldeCompte = soldeCompte;
    }

    public int getNumCompte() {
        return this.numCompte;
    }
    public float getSoldeCompte(){
        return this.soldeCompte;
    }
    public void setNumCompte(int numCompte){
        this.numCompte=numCompte;

    }
    public void setSoldeCompte(float soldeCompte){
        this.soldeCompte=soldeCompte;
    }
    public void opperationSoldeCompte(String signe,float valeur ){
        {
            if (signe == "enleve"){
                valeur=valeur*-1;
            }
            this.soldeCompte=this.soldeCompte+valeur;
        }
    }

    @Override
    public String toString() {
        return "numCompte= " + numCompte + " soldeCompte= " + soldeCompte;
    }
}
