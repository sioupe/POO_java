package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Maison maison = new Maison();
        maison.ajouterPiece(new Chambre(20,1));
        maison.ajouterPiece(new Chambre(15,1));
        maison.ajouterPiece(new Chambre(15,1));
        maison.ajouterPiece(new Cuisine(20,0));
        maison.ajouterPiece(new SalleDeBain(10,1));
        maison.ajouterPiece(new SalleDeBain(10,0));
        maison.ajouterPiece(new WC(5,0));
        maison.ajouterPiece(new WC(5,1));
        maison.ajouterPiece(new Salon(30,0));

        System.out.println("la maison a une superficie de "+maison.superficieTotal()+" m²");
        System.out.println("le rez de chaussé fait "+maison.superficieEtage(0)+" m²");
        System.out.println("le premier étage fait "+maison.superficieEtage(1)+" m²");
    }
}
