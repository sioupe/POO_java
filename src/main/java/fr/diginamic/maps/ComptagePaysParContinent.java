package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        List<Pays> listPays =new ArrayList<>();
        Collections.addAll(listPays,new Pays("France",65_000_000,"Europe"),new Pays("Allemagne",80_000_000,"Europe"),new Pays("Belgique",10_000_000,"Europe"),new Pays("Russie",150_000_000,"Asie"),new Pays("Chine",1_400_000_000,"Asie"),new Pays("Indonesie",220_000_000,"Oceanie"),new Pays("Australie",20_000_000,"Oceanie"));
        HashMap<String,Integer> mapPays=new HashMap<>();
        for (Pays pays :listPays ) {
            if (mapPays.containsKey(pays.getContinent())) {
                mapPays.put(pays.getContinent(),(mapPays.get(pays.getContinent()))+1);
            }else{
                mapPays.put(pays.getContinent(), 1);
            }
        }
        for (String key :mapPays.keySet() ) {
            System.out.println(key+" | "+mapPays.get(key));
        }

    }
}
