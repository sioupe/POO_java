package fr.diginamic.combat;

public class Gobelin extends Entite {
    public Gobelin() {
        this.force=(int)(Math.random()*5)+5;
        this.sante=(int)(Math.random()*5)+10;
        this.score=2;
    }
}
