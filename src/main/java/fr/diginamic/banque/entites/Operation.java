package fr.diginamic.banque.entites;

abstract public class Operation {
    String dateOpe;
    float montant;

    public Operation(float montant, String dateOpe) {
        this.montant = montant;
        this.dateOpe = dateOpe;
    }

    public String getDateOpe() {
        return dateOpe;
    }

    public void setDateOpe(String dateOpe) {
        this.dateOpe = dateOpe;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "TypeOpe= "+getType()+" dateOpe= " + dateOpe +"\nmontant= " + montant;
    }
}
