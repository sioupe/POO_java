package test.operation;

import fr.diginamic.banque.entites.Operation;
import fr.diginamic.operations.Operations;

import java.util.Scanner;

public class TestOperations {
    public static void main(String[] args) {
        Operations operations =new Operations();
        System.out.println(operations.calcul(2,3,"+"));
        System.out.println(operations.calcul(2,3,"-"));
        System.out.println(operations.calcul(2,3,"*"));
        System.out.println(operations.calcul(2,3,"/"));
    }
}
