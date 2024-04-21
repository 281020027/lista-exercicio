package br.edu.uniaeso;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        int contador = 0;

        try (BufferedReader leitor = new BufferedReader(new FileReader("meuarquivo.txt"))) {
            String linha;

            while ((linha = leitor.readLine()) != null) {
                contador += contarPalavra(linha, "java");
            }

            System.out.println("A palavra 'java' apareceu " + contador + " vezes no texto.");

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    private static int contarPalavra(String texto, String palavra) {
        return (texto.toLowerCase().split(palavra.toLowerCase(), -1).length - 1);
    }
}
