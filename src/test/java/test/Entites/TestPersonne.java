package test.Entites;

import org.entites.AdressePostale;
import org.entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne p1 = new Personne("Jean","Jacques");

        Personne p2 = new Personne("Jean","Jacques",new AdressePostale(58,34130,"Marechal Ferrand","Mauguio"));
        Personne p3 = new Personne("Michel", "Lavache");

        p3.setAdresse(new AdressePostale(8, 34740,"Pompidou","Castelanu-Le-Lez"));
        p3.affichage();
        /*p1.nom = "jacques";
        p1.prenom = "jean";
        p1.adresse = new AdressePostale();

        p2.nom = "jacques";
        p2.prenom = "jean";
        p2.adresse = new AdressePostale();*/

    }
}
