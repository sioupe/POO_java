package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;


public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne moyenne1 = new CalculMoyenne();
        int nb;
        for (int i = 0; i < 10; i++) {
            nb = (int) (Math.random() * 10);
            moyenne1.ajout(nb);
            System.out.println(nb);
        }
        System.out.println(moyenne1.calcul());

    }
}
