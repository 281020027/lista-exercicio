package br.edu.uniaeso;

import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try (FileWriter arq = new FileWriter("meuarquivo.txt")) {
            arq.write("Olá, mundo!");
        } catch (IOException e) {
            System.out.println("Não consegui criar ou escrever no arquivo");
        }
    }
}
