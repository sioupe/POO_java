package fr.diginamic.banque.entites;

public class Debit extends Operation {


    public Debit(float montant, String dateOpe) {
        super(montant, dateOpe);
    }

    @Override
    public String getType() {
        return "Debit";
    }
}
