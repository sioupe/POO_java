package fr.diginamic.tpJ2.jeuDeLaVieConway.classe;

import java.util.ArrayList;

public class Cellule {
    private boolean etat;
    private int x;
    private int y;

    public Cellule(boolean etat, int x, int y) {
        this.etat = etat;
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public Cellule(boolean etat) {
        this.etat = etat;
    }

    public boolean getEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }
    public Boolean MAJEtat(ArrayList<Boolean> celluleAutour){
        return switch (celluleAutour.size()) {
            case 2 -> this.getEtat();
            case 3 -> true;
            default -> false;
        };
    }

    @Override
    public String toString() {
        if (etat == true) {
            return " x ";
        }else {
            return "   " ;
        }
    }
}
