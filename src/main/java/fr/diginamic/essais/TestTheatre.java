package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

import java.sql.SQLOutput;
import java.util.Arrays;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre =new Theatre("Jean Villar", 100);
        while(theatre.inscrire((int)(Math.random()*30),1.1f)){
        }
        System.out.print("il y a "+theatre.getNbClientInscrit()+" client pour une recette de ");
        System.out.format("%.02f",theatre.getRecetteTotale());
    }
}
