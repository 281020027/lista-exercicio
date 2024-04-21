package br.edu.uniaeso;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class App {
    public static void main(String[] args) {

        try (FileInputStream fileIn = new FileInputStream("pessoa.dat");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            while (true) {
                try {
                    Pessoa pessoa = (Pessoa) in.readObject();
                    System.out.println("Detalhes da pessoa: " + pessoa);
                } catch (IOException | ClassNotFoundException e) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
