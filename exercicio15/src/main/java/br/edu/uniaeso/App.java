package br.edu.uniaeso;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class App {
    public static void main(String[] args) {
        try (FileInputStream fileIn = new FileInputStream("arquivo_grande.bin");
             FileOutputStream fileOut = new FileOutputStream("copia_arquivo_grande.bin")) {

            byte[] buffer = new byte[8192];
            int bytesRead;

            while ((bytesRead = fileIn.read(buffer)) != -1) {
                fileOut.write(buffer, 0, bytesRead);
            }

            System.out.println("Arquivo copiado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao copiar o arquivo: " + e.getMessage());
        }
    }
}
