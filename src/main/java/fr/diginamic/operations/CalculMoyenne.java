package fr.diginamic.operations;

public class CalculMoyenne {
    private double[] tabDeVal = new double[0];

    public void ajout(double valeur) {
        double[] tampon = new double[this.tabDeVal.length];
        System.arraycopy(tabDeVal, 0, tampon, 0, tampon.length);
        tabDeVal = new double[tabDeVal.length+1];
        System.arraycopy(tampon, 0, tabDeVal, 0, tampon.length);
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
