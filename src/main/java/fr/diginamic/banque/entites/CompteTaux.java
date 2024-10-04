package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    int tauxRemuneration;

    public CompteTaux(int numCompte, float soldeCompte, int tauxRemuneration) {
        super(numCompte, soldeCompte);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString() {
        return super.toString()+" tauxRemuneration=" + tauxRemuneration ;
    }
}
