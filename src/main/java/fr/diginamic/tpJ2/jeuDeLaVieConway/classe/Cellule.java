package fr.diginamic.tpJ2.jeuDeLaVieConway.classe;

import java.util.ArrayList;
import java.util.HashSet;

public class Cellule {
    private boolean etat;
    private ArrayList<Boolean> celluleAutour;
    private final int x;
    private final int y;
    public Cellule(char etat, int x ,int y){
        this.etat= '1' == etat;
        this.x = x;
        this.y = y;
    }
    public Cellule(boolean etat,int x, int y) {
        this.etat = etat;
        this.x = x;
        this.y = y;

        celluleAutour=new ArrayList<>();

    }

    public ArrayList<Boolean> getCelluleAutour() {
        return celluleAutour;
    }

    public void addCelluleAutour(boolean val) {
        this.celluleAutour.add(val);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean getEtat() {
        return this.etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }
    public void MAJEtat(){
        switch (celluleAutour.size()) {

            case 2 :
                break;
            case 3 :
                this.etat= true;
                break;
            default :
                this.etat=false;
        }
    }

    @Override
    public String toString() {
        if (etat) {
            return " x ";
        }else {
            return "   " ;
        }
    }
}
