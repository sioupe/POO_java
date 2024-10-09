package fr.diginamic.tpJ2.jeuDeLaVieConway.classe;

import java.util.ArrayList;

public class Plateau {
    private ArrayList<ArrayList<Cellule>> plateau =new ArrayList<ArrayList<Cellule>>();

    public Plateau(int largeur, int hauteur) {
        for (int y = 0; y < hauteur-1; y++) {
            this.plateau.add(new ArrayList<Cellule>());
            for (int x = 0; x < largeur-1; x++) {
                this.plateau.get(y).add(new Cellule(false,x,y));
            }
        }

    }
    public ArrayList<Boolean> contourCellule(int x,int y){
        ArrayList<Boolean> celluleAutour =new ArrayList<Boolean>();
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (x == 0 && y==0) {
                    celluleAutour.add(false);
                }else {
                    celluleAutour.add(plateau.get(x+j).get(y+i).getEtat());
                }

            }
        }
        return celluleAutour;
    }

    @Override
    public String toString() {
        for (ArrayList<Cellule> ligne : plateau){
            System.out.println(ligne);
        }
        return "";
    }
}
