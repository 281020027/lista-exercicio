package br.edu.uniaeso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try (BufferedWriter escritor1 = new BufferedWriter(new FileWriter("arquivo1.txt"));
             BufferedWriter escritor2 = new BufferedWriter(new FileWriter("arquivo2.txt"))) {

            // Escreve conteúdo nos arquivos
            escritor1.write("Conteúdo do arquivo1: Linha 1\nLinha 2 do arquivo1.");
            escritor2.write("Conteúdo do arquivo2: Linha 1\nLinha 2 do arquivo2.");

            System.out.println("Arquivos 'arquivo1.txt' e 'arquivo2.txt' criados com conteúdo.");
        } catch (IOException e) {
            System.out.println("Erro ao criar os arquivos: " + e.getMessage());
        }

        try (BufferedReader leitor1 = new BufferedReader(new FileReader("arquivo1.txt"));
             BufferedReader leitor2 = new BufferedReader(new FileReader("arquivo2.txt"));
             BufferedWriter escritorConcatenado = new BufferedWriter(new FileWriter("arquivo_concatenado.txt"))) {

            copiarConteudo(leitor1, escritorConcatenado);
            copiarConteudo(leitor2, escritorConcatenado);

            System.out.println("Arquivo 'arquivo_concatenado.txt' criado com conteúdo concatenado.");
        } catch (IOException e) {
            System.out.println("Erro ao manipular arquivos: " + e.getMessage());
        }
    }

    private static void copiarConteudo(BufferedReader leitor, BufferedWriter escritor) throws IOException {
        String linha;
        while ((linha = leitor.readLine()) != null) {
            escritor.write(linha);
            escritor.newLine();
        }
    }
}
