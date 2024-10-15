package fr.diginamic.chaines;

public class StringUtils {
    public static String append(Object... objects){
        StringBuilder resultat =new StringBuilder();
        for (Object object :objects ) {
            resultat.append( object.toString());
        }
        return resultat.toString();
    }
}
