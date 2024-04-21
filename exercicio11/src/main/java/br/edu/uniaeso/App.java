package br.edu.uniaeso;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30);
        
        try (FileOutputStream fileOut = new FileOutputStream("pessoa.dat");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(pessoa);
            System.out.println("Objeto serializado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
