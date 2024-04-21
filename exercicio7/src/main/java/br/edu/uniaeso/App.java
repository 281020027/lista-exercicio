package br.edu.uniaeso;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        try {
            List<String> linhas = Files.readAllLines(Paths.get("meuarquivo.txt"));
            Collections.sort(linhas);

            Files.write(Paths.get("meuarquivo_ordenado.txt"), linhas);
            System.out.println("Arquivo ordenado!");
        } catch (IOException e) {
            System.out.println("Erro ao processar o arquivo.");
        }
    }
}
