package fr.diginamic.banque.test;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

import static java.lang.System.*;

public class TestOperation {
    public static void main(String[] args) {
        float montantGlobal=0;
        Operation[] tabOpe = {new Debit(5f,"12/06/2024"),new Debit(64.7f,"12/06/2024"),new Credit(5f,"12/06/2024"),new Credit(64.7f,"12/06/2024")};

        for (Operation operation : tabOpe){
            if (operation.getType() == "Credit") {
                montantGlobal += operation.getMontant();
            }else{
                montantGlobal -= operation.getMontant();
            }
        }

        for (Operation operation : tabOpe){
            out.println(operation.toString());
        }
        out.println(montantGlobal);

    }
}
