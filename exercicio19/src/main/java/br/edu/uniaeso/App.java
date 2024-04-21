package br.edu.uniaeso;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.opencsv.CSVWriter;

public class App {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        try (CSVWriter writer = new CSVWriter(new FileWriter("funcionarios.csv", true))) {
            
            writer.writeNext(new String[]{"Nome", "Cargo", "Salario"});

            while (true) {
                System.out.println("Insira os detalhes do funcionário:\n");
                
                System.out.print("Nome: ");
                String nome = ler.nextLine();
                
                System.out.print("Cargo: ");
                String cargo = ler.nextLine();
                
                System.out.print("Salario: ");
                double salario = ler.nextDouble();
                ler.nextLine();

                String[] funcionario = {nome, cargo, String.valueOf(salario)};
                writer.writeNext(funcionario);

                System.out.print("\nDeseja adicionar outro funcionário? (s/n): ");
                String resposta = ler.nextLine();
                if (resposta.equalsIgnoreCase("n")) {
                    break;
                }
            }

            System.out.println("Informações dos funcionários foram gravadas em 'funcionarios.csv'.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        ler.close();
    }
}
