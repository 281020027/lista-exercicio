package br.edu.uniaeso;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {
    public static void main(String[] args) {

        try (FileInputStream file = new FileInputStream("conta.dat");
                ObjectInputStream in = new ObjectInputStream(file)) {
            while (true) {
                try {
                    ContaBancaria conta = (ContaBancaria) in.readObject();
            
                    conta.depositar(100.0);
                    try (FileOutputStream fileOut = new FileOutputStream("conta.dat");
                         ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                        out.writeObject(conta);
                        System.out.println("Saldo atualizado e objeto serializado com sucesso!");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
