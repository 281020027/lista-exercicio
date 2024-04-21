package br.edu.uniaeso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        try (BufferedReader leitor = new BufferedReader(new FileReader("meuarquivo.txt"));
             BufferedWriter escritor = new BufferedWriter(new FileWriter("meuarquivo_sem_excluir.txt"))) {

            String linha;
            while ((linha = leitor.readLine()) != null) {
                if (!linha.contains("excluir")) {
                    escritor.write(linha);
                    escritor.newLine();
                }
            }

            System.out.println("Ocorrências das palavras foram removidas com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao manipular arquivos: " + e.getMessage());
        }
    }
}
