package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
    private int nbJourTravaille;
    public Pigiste(String nom, String prénom,int nbJourTravaille) {

        super(nom, prénom);
        this.nbJourTravaille=nbJourTravaille;
    }

    @Override
    public float getSalaire() {
        return (float)(1398.70/30f);
    }
}
