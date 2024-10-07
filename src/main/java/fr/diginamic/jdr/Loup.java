package fr.diginamic.jdr;

public class Loup extends Entite {
    public Loup() {
        this.force=(int)(Math.random()*5)+3;
        this.sante=(int)(Math.random()*5)+5;
        this.score=1;
    }
}
