package br.edu.uniaeso;

import java.io.FileInputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        final int TAMANHO_LEITURA = 100;

        try (FileInputStream arquivo = new FileInputStream("arquivo.bin")) {
            byte[] buffer = new byte[TAMANHO_LEITURA];
            int bytesLidos = arquivo.read(buffer);

            if (bytesLidos != -1) {
                System.out.println("Conteúdo dos primeiros 100 bytes:");
                for (int i = 0; i < bytesLidos; i++) {
                    System.out.print((char) buffer[i]);
                }
                System.out.println();
            } else {
                System.out.println("Nenhum byte foi lido do arquivo.");
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
