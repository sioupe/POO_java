package fr.diginamic.salaire;

public class Salarie extends Intervenant{
private float salaireMensuel;
    public Salarie(String nom, String prénom,float salaireMensuel) {
        super(nom, prénom);
        this.salaireMensuel=salaireMensuel;
    }

    @Override
    public float getSalaire() {
        return this.salaireMensuel;
    }
}
