package fr.diginamic.fichier;

import jdk.dynalink.StandardOperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {
        List<Commune> listeVilles = new ArrayList<>();
        Path path = Paths.get("E:\\Diginamic\\approche-objet\\recensement.csv");

        FileReader fileReader = new FileReader("E:\\Diginamic\\approche-objet\\recensement.csv");
        BufferedReader bufferedReader =new BufferedReader(fileReader);
        String[] entete =bufferedReader.readLine().split(";");
        for (int i = 0; i < 100; i++) {
            String tampon=bufferedReader.readLine();
            String [] infoVille=tampon.split(";");
            listeVilles.add(new Commune(infoVille[6],Integer.parseInt(infoVille[0]),infoVille[1],Long.parseLong(infoVille[9].replace(" ","")) ));

        }
        Path pathEcrire = Paths.get("E:\\Diginamic\\approche-objet\\exo4.csv");
        List<String> lines = Files.readAllLines(path);
        Files.writeString(pathEcrire,entete[6]+";"+entete[0]+";"+entete[1]+";"+entete[9]);
         List<Long[]> nbVilleDep =new ArrayList<>();
         List<Long[]> nbPopDep =new ArrayList<>();
         nbVilleDep.add(new Long[]{(long)listeVilles.getFirst().getCodeDepartement(),1L});
        for (Commune commune :listeVilles ) {
            if (commune.getPopTotal()>=25000){
                Files.writeString(pathEcrire,commune.conversionFichier(), StandardOpenOption.APPEND);
            }
            for (Long[] codePostal :nbVilleDep ) {
                if (commune.getCodeDepartement()==codePostal[0]){

                    codePostal[1]++;
                }else {
                    nbVilleDep.add(new Long[]{(long)commune.getCodeDepartement(), 1L});

                }
            }


        }
        for (Long[] element :nbVilleDep ) {
            System.out.println(element[0]+ "|"+element[1]);
        }
        //System.out.println(lines);
    }
}
