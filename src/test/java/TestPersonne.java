import org.entites.AdressePostale;
import org.entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne p1 = new Personne();
        Personne p2 = new Personne();
        p1.nom = "jacques";
        p1.prenom = "jean";
        p1.adresse = new AdressePostale();

        p2.nom = "jacques";
        p2.prenom = "jean";
        p2.adresse = new AdressePostale();

    }
}
