import org.entites.AdressePostale;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adresse1=new AdressePostale();
        AdressePostale adresse2=new AdressePostale();

        adresse1.numeroDeRue = 3;
        adresse1.codePostal=34160;
        adresse1.libelleRue = "jack";
        adresse1.ville="Castries";

        adresse2.numeroDeRue = 59;
        adresse2.codePostal=34130;
        adresse2.libelleRue = "Jean";
        adresse2.ville="mauguio";
    }
}
