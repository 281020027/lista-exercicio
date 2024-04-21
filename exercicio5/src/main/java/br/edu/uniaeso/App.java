package br.edu.uniaeso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("meuarquivo.txt"));
             BufferedWriter writer = Files.newBufferedWriter(Paths.get("meuarquivo_python.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("(?i)Java", "Python");
                writer.write(line + System.lineSeparator());
            }

            System.out.println("Substituição concluída.");
        } catch (IOException e) {
            System.out.println("Erro ao processar o arquivo.");
        }
    }
}
