package fr.diginamic.banque.test;

import fr.diginamic.banque.entites.*;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte1 = new Compte(1,56.3f);
        Compte[] comptes = {compte1,new CompteTaux(2,94.5f,20)};

       for(Compte compte:comptes){
           System.out.println(compte.toString());
       }


        //System.out.println(compte1.toString());//ressort un pointeur
    }
}
