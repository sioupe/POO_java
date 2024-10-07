package fr.diginamic.jdr;

public class Perso extends Entite {

    public Perso() {
        this.force=(int)(Math.random()*6)+12;
        this.sante=(int)(Math.random()*30)+20;
        this.score=0;
    }
}
