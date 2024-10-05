package fr.diginamic.operations;

public class CalculMoyenne {
    private double[] tabDeVal = new double[0];

    public void ajout(double valeur) {
        double[] tampon = new double[this.tabDeVal.length];
        for (int i = 0; i < tampon.length; i++) {
            tampon[i]=tabDeVal[i];
        }
        tabDeVal = new double[tabDeVal.length+1];
        for (int i = 0; i < tampon.length; i++) {
            tabDeVal[i]=tampon[i];
        }
        tabDeVal[tabDeVal.length-1]=valeur;

    }
    public double calcul(){
        double moyenne = 0.0;
        for (double val:this.tabDeVal){
           moyenne += val;
        }
        return (moyenne/this.tabDeVal.length);
    }
}
