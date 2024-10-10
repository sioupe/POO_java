package fr.diginamic.fichier;

import java.util.List;

public class Commune {
    private final String nom;
    private final int codeDepartement;
    private final String nomRegion;
    private final long PopTotal;

    public Commune(String nom, int codeDepartement, String nomRegion, long popTotal) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.PopTotal = popTotal;
    }

    public int getCodeDepartement() {
        return codeDepartement;
    }

    public long getPopTotal() {
        return PopTotal;
    }
    public String conversionFichier(){
        return "\n"+this.nom+";"+this.codeDepartement+";"+this.nomRegion+";"+this.PopTotal;
    }

    @Override
    public String toString() {
        return "Commune{" +
                "nom='" + nom + '\'' +
                ", codeDepartement=" + codeDepartement +
                ", nomRegion='" + nomRegion + '\'' +
                ", PopTotal=" + PopTotal +
                '}';
    }
}
