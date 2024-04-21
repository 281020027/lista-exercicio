package br.edu.uniaeso;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Venda> vendas = new ArrayList<>();
        vendas.add(new Venda("2024-02-15", 100.0, "Produto 1"));
        vendas.add(new Venda("2024-03-16", 1750.0, "Produto 4"));
        vendas.add(new Venda("2024-04-17", 212.0, "Produto 3"));
        Venda.exportarVendasParaCSV(vendas, "vendas.csv");

        System.out.println("Vendas exportadas para vendas.csv com sucesso!");
    }
}
