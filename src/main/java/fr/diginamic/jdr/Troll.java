package fr.diginamic.jdr;

public class Troll extends Entite {
    public Troll() {
        this.force=(int)(Math.random()*5)+10;
        this.sante=(int)(Math.random()*10)+20;
        this.score=5;
    }
}
