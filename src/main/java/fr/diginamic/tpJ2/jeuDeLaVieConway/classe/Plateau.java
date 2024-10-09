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

    @Override
    public String toString() {
        for (ArrayList<Cellule> ligne : plateau){
            System.out.println(ligne);
        }
        return "";
    }
}
