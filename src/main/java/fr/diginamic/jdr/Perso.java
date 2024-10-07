package fr.diginamic.jdr;

public class Perso extends Entite {
    private Potion[] ceinturePotion = new Potion[3];

    public Perso() {
        this.force=(int)(Math.random()*6)+12;
        this.sante=(int)(Math.random()*30)+20;
        this.score=0;
        this.ceinturePotion[0]=new PotionSoin((int)(Math.random()*5)+5,"Potion de soin");
        this.ceinturePotion[1]=new PotionBuff(3,"Potion d'attaque mineur",1,"force");
        this.ceinturePotion[2]=new PotionBuff(5,"Potion d'attaque majeur",2,"force");
    }
}
