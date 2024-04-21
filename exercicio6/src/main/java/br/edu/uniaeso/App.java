package br.edu.uniaeso;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("dados.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] pessoa = line.split(",");
                System.out.printf("[Nome=%s, Idade=%s, Email=%s]%n", pessoa[0], pessoa[1], pessoa[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
