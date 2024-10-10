package fr.diginamic.fichier;

public class Commune {
    private String nom;
    private int codeDepartement;
    private String nomRegion;
    private long PopTotal;

    public Commune(String nom, int codeDepartement, String nomRegion, long popTotal) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.PopTotal = popTotal;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", codeDepartement=" + codeDepartement +
                ", nomRegion='" + nomRegion + '\'' +
                ", PopTotal=" + PopTotal +
                '}';
    }
}
