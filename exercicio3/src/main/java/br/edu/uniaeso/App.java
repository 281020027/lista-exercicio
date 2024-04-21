package br.edu.uniaeso;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) {
       
        try {
            List<String> linhas = Files.readAllLines(Paths.get("meuarquivo.txt"));
            linhas.forEach(System.out::println);

            BufferedWriter escritor = new BufferedWriter(new FileWriter("meuarquivo.txt", true));
            escritor.newLine();
            escritor.write("Isso é uma adição!");
            escritor.close();
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado");
        }
    }
}
