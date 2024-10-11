package fr.diginamic.tpJ2.jeuDeLaVieConway.classe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Plateau {
    private final ArrayList<ArrayList<Cellule>> plateau = new ArrayList<>();





    public Plateau(List<String> plateau){
        for (int y = 0; y < plateau.size(); y++) {
            this.plateau.add(new ArrayList<>());
            char[] ligne= plateau.get(y).toCharArray();
            for (int x = 0; x < ligne.length; x++) {
                this.plateau.get(y).add(new Cellule(ligne[x],x,y));
            }
        }
    }
    public Plateau(int largeur, int hauteur) {
        for (int y = 0; y < hauteur; y++) {
            this.plateau.add(new ArrayList<>());
            for (int x = 0; x < largeur; x++) {
                this.plateau.get(y).add(new Cellule(false, x, y));
            }
        }


    }
    public Plateau(String path) throws IOException {
        this(recupLienTexte(path));
    }


    public Cellule getCellule(int x, int y) {
        return this.plateau.get(y).get(x);
    }

    public void setCellule(int x, int y, boolean etat) {
        this.plateau.get(y).get(x).setEtat(etat);
    }

    public void contourCellule(Cellule cellule) {
        cellule.getCelluleAutour().clear();

        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (!( i== 0 && j==0) && this.getCellule(cellule.getX()+j, cellule.getY()+i).getEtat()) {

                    cellule.addCelluleAutour(true);
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
    private static List<String>recupLienTexte(String path) throws IOException {
        Path pathEntree = Paths.get(path);
        List<String> plateauTexte = Files.readAllLines(pathEntree);
        return plateauTexte;
    }
    @Override
    public String toString() {
        for (int i = 1; i < this.plateau.size(); i++) {
                System.out.println(this.plateau.get(i));
            }

        return "";
    }
}

