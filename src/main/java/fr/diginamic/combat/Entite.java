package fr.diginamic.combat;

public abstract class Entite {
    int force;
    int sante;
    int score;

    public int getSante() {
        return sante;
    }

    public void setSante(int sante) {
        this.sante = sante;
    }

    public int getForce() {
        return force;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public int taper(){
        return (this.force+(int)(Math.random()*10));
    }
    public boolean vivant(){
        return this.sante>0;
    }

}
