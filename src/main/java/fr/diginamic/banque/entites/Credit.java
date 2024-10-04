package fr.diginamic.banque.entites;

public class Credit extends Operation {



    public Credit(float montant, String dateOpe) {
        super(montant, dateOpe);
    }
    @Override
    public String getType() {
        return "Credit";
    }

}
