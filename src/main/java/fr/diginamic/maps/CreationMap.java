package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Map;

public class CreationMap {
    public static void main(String[] args) {
        Map<String,Integer> employe = new HashMap<>();
        employe.put("Paul",1750);
        employe.put("Hicham",1825);
        employe.put("Yu",2250);
        employe.put("Ingrid",2015);
        employe.put("Chantal",2418);

        System.out.println(employe.size());
    }
}
