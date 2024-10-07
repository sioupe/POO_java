package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {


    public static void main(String[] args) {
        Salarie salarie = new Salarie("Jean","Jacques",1365);
        Pigiste pigiste = new Pigiste("Jean","Jacques",8);
        System.out.println("le salarie touche "+salarie.getSalaire()+" euros par mois");
        System.out.println("le pigiste touche "+pigiste.getSalaire()+" euros sur ce contrat");
        salarie.afficherDonnees();
        pigiste.afficherDonnees();
    }
}
