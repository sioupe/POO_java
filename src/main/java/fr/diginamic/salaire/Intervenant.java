package fr.diginamic.salaire;

public abstract class Intervenant {
    private String nom;
    private String prenom;

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    public void afficherDonnees(){
        System.out.print("nom = "+this.nom);
        System.out.print(" | prenom = "+this.prenom);
        System.out.print(" | son salaire = "+this.getSalaire()+" euros");
        System.out.println(" | son statut = "+this.getClass().getName().substring(this.getClass().getName().lastIndexOf(".")+1));

    }
    public abstract float getSalaire();
}
