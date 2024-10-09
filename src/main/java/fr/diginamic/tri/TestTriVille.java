package fr.diginamic.tri;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestTriVille {
    public static void main(String[] args) {
        ArrayList<Ville> listVille = new ArrayList<Ville>();
        Collections.addAll(listVille,new Ville("Nice",343000),new Ville("Carcassonne",47800),new Ville("Narbonne",53400),new Ville("Lyon",484000),new Ville("Foix",9700),new Ville("Pau",77200),new Ville("Marseille",850700),new Ville("Tarbes",40600));
        System.out.println(listVille);
        Collections.sort(listVille);
        System.out.println(listVille);
    }
}
