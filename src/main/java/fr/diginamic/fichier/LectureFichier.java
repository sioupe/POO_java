package fr.diginamic.fichier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {
        List<Commune> listeVilles = new ArrayList<>();
        Path path = Paths.get("E:\\Diginamic\\approche-objet\\recensement.csv");

        FileReader fileReader = new FileReader("E:\\Diginamic\\approche-objet\\recensement.csv");
        BufferedReader bufferedReader =new BufferedReader(fileReader);
        for (int i = 0; i < 100; i++) {
            String tampon=bufferedReader.readLine();
            String [] infoVille=tampon.split(";");
            System.out.println( infoVille[6]+" "+infoVille[0]+" "+infoVille[1]+" "+infoVille[9]);
            System.out.println();
            //listeVilles.add(new Ville(infoVille[6],Integer.parseInt(infoVille[0]),infoVille[1],12 ));

            System.out.println(tampon);
        }
        //List<String> lines = Files.readAllLines(path);
        //System.out.println(lines);
    }
}
