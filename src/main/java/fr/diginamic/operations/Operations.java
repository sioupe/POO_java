package fr.diginamic.operations;

public class Operations {
    public double calcul(double a,double b,String operateur){
        if (operateur.equals( "+")) {
            return a+b;
        }else if(operateur.equals("-")){
            return a-b;
        } else if (operateur.equals("*")) {
            return a*b;
        }else {
            return a/b;
        }
    }
}
