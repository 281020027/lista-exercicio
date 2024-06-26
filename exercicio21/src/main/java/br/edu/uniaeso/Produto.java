package br.edu.uniaeso;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvBindByName;

public class Produto {

    @CsvBindByName(column = "Nome")
    private String nome;

    @CsvBindByName(column = "Preço")
    private double preco;

    @CsvBindByName(column = "Quantidade")
    private int quantidade;

    public static void adicionarProdutoAoCSV(String nome, double preco, int quantidade) {
        try {
            FileWriter outputFile = new FileWriter("produtos.csv", true);
            CSVWriter writer = new CSVWriter(outputFile);

            String[] produto = { nome, Double.toString(preco), Integer.toString(quantidade) };
            writer.writeNext(produto);

            writer.close();
            outputFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Produto [nome = " + nome + ", preco = " + preco + ", quantidade = " + quantidade + "]";
    }
}
