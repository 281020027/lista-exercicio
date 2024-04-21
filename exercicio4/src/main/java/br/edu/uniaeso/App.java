package br.edu.uniaeso;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) {
        
        try {
            List<String> linhas = Files.readAllLines(Paths.get("meuarquivo.txt"));
            int totalLinhas = linhas.size();
            System.out.println("O arquivo tem: " + totalLinhas + " Linhas");
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado !!");
        }
    }
}
