package fr.diginamic.banque.test;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte1 = new Compte(1,56.3f);
        System.out.println(compte1);//ressort un pointeur
    }
}
