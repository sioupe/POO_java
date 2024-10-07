package fr.diginamic.combat;

public class PotionSoin extends Potion{
    public PotionSoin(int valeur, String nom) {
        super(valeur, nom);
    }

    @Override
    public void description() {
        System.out.println("la potion soigne "+this.valeur+" de vie");
    }
    public int use(){
        return this.valeur;
    }
}
