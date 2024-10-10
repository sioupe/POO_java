package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("E:\\Diginamic\\approche-objet\\recensement.csv");
        List<String> lines = Files.readAllLines(path);
        System.out.println(lines);
    }
}
