package fr.diginamic.tpJ2.jeuDeLaVieConway.classe;

import java.util.ArrayList;

public class Plateau {
    private ArrayList<ArrayList<Cellule>> plateau = new ArrayList<>();


    public Plateau(int largeur, int hauteur) {
        for (int y = 0; y < hauteur; y++) {
            this.plateau.add(new ArrayList<>());
            for (int x = 0; x < largeur; x++) {
                this.plateau.get(y).add(new Cellule(false, x, y));
            }
        }


    }


    public Cellule getCellule(int x, int y) {
        return this.plateau.get(y).get(x);
    }

    public void setCellule(int x, int y, boolean etat) {
        this.plateau.get(y).get(x).setEtat(etat);
    }

    public void contourCellule(Cellule cellule) {
        cellule.getCelluleAutour().clear();
        int k = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (!( i== 0 && j==0) && this.getCellule(cellule.getX()+j, cellule.getY()+i).getEtat()) {

                    cellule.getCelluleAutour().add(true);
                }

            }
        }





    }

    public void MAJPlateau() {
        for (int y = 1;y< plateau.size()-1; y++) {
            for (int x =1; x< plateau.size()-1;x++) {
                this.contourCellule(this.getCellule(x,y));
            }
        }
        for (ArrayList<Cellule> ligne : this.plateau) {
            for (Cellule cellule : ligne) {
                cellule.MAJEtat();
            }
        }

    }

    @Override
    public String toString() {
        for (int i = 1; i < this.plateau.size(); i++) {
                System.out.println(this.plateau.get(i));
            }

        return "";
    }
}

