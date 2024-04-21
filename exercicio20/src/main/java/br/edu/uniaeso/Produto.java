package br.edu.uniaeso;

import com.opencsv.bean.CsvBindByName;

public class Produto {

    @CsvBindByName(column = "Nome")
    private String nome;

    @CsvBindByName(column = "Preço")
    private double preco;

    @CsvBindByName(column = "Quantidade")
    private int quantidade;

    @Override
    public String toString() {
        return "Produto [nome = " + nome + ", preco = " + preco + ", quantidade = " + quantidade + "]";
    }
}
