package fr.diginamic.essais;
import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        Operations operations =new Operations();
        System.out.println(operations.calcul(2,3,"+"));
        System.out.println(operations.calcul(2,3,"-"));
        System.out.println(operations.calcul(2,3,"*"));
        System.out.println(operations.calcul(2,3,"/"));
    }
}
