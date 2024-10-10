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
        List<String> enteteEcrire = new ArrayList<>();
        /*enteteEcrire.add(entete[6]);
        enteteEcrire.add(entete[0]);
        enteteEcrire.add(entete[1]);
        enteteEcrire.add(entete[9]);*/
        for (int i = 0; i < 100; i++) {
            String tampon=bufferedReader.readLine();
            String [] infoVille=tampon.split(";");
            System.out.println();
            listeVilles.add(new Commune(infoVille[6],Integer.parseInt(infoVille[0]),infoVille[1],Long.parseLong(infoVille[9].replace(" ","")) ));

        }
        Path pathEcrire = Paths.get("E:\\Diginamic\\approche-objet\\exo4.csv");

        Files.writeString(pathEcrire,entete[6]+";"+entete[0]+";"+entete[1]+";"+entete[9]);

        for (Commune commune :listeVilles ) {
            if (commune.getPopTotal()>=25000){
                Files.writeString(pathEcrire,commune.conversionFichier(), StandardOpenOption.APPEND);
            }
        }


        System.out.println(listeVilles.get(1));
        //List<String> lines = Files.readAllLines(path);
        //System.out.println(lines);
    }
}
