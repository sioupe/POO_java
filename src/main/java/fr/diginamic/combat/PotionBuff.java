package fr.diginamic.combat;

public class PotionBuff extends Potion{
    private int tempBuff;
    private String typeBuff;
    public PotionBuff(int valeur, String nom,int tempBuff,String typeBuff) {
        super(valeur, nom);
        this.tempBuff=tempBuff;
        this.typeBuff =typeBuff;
    }

    @Override
    public void description() {
        System.out.println("la potion augmente la stat de "+typeBuff+" de "+valeur);
    }
}
