package fr.diginamic.tpJ2.jeuDeLaVieConway.classe;

import java.util.ArrayList;

public class Plateau {
    private final ArrayList<ArrayList<Cellule>> plateau = new ArrayList<>();


    public Plateau(int largeur, int hauteur) {
        for (int y = 0; y < hauteur-1; y++) {
            this.plateau.add(new ArrayList<>());
            for (int x = 0; x < largeur-1; x++) {
                this.plateau.get(y).add(new Cellule(false,x,y));
            }
        }

    }

    public Cellule getCellule(int x,int y){
        return this.plateau.get(y).get(x);
    }
    public void MAJPlateau(){
        for (ArrayList<Cellule> ligne : this.plateau ) {
            for (Cellule cellule :ligne ) {
                cellule.MAJEtat();
            }
        }
    }
    public void contourCellule(Cellule cellule){
        cellule.getCelluleAutour().clear();
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (cellule.getX() != 0 && cellule.getY()!=0 && cellule.getEtat()) {
                    cellule.getCelluleAutour().add(true);                }

            }
        }
    }

    @Override
    public String toString() {
        for (ArrayList<Cellule> ligne : plateau){
            System.out.println(ligne);
        }
        return "";
    }
}
