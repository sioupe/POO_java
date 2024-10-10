package fr.diginamic.fichier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {
        Path pathLire = Paths.get("E:\\Diginamic\\approche-objet\\recensement.csv");
        FileReader fileReader = new FileReader("E:\\Diginamic\\approche-objet\\recensement.csv");
        BufferedReader bufferedReader =new BufferedReader(fileReader);
        List<String> lignesEcrire = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String tampon=bufferedReader.readLine();

            lignesEcrire.add(tampon);
            System.out.println(tampon);
        }
        Path pathEcrire = Paths.get("E:\\Diginamic\\approche-objet\\test.csv");
        Files.write(pathEcrire,lignesEcrire);
    }
}
