package br.edu.uniaeso;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArquivoVendas.adicionarVenda(new Venda(1, "Arroz", 10, 20.00));
        ArquivoVendas.adicionarVenda(new Venda(2, "Feijão", 5, 15.00));
        ArquivoVendas.adicionarVenda(new Venda(3, "Açúcar", 8, 12.00));

        ArquivoVendas.atualizarVenda(new Venda(1, "Arroz", 10, 22.00));

        ArquivoVendas.excluirVenda(3, scanner);
        ArquivoVendas.excluirVenda(2, scanner);

        List<Venda> vendas = ArquivoVendas.lerTodasVendas();
        System.out.println("Vendas restantes:");
        for (Venda venda : vendas) {
            System.out.println(venda);
        }
        
        scanner.close();
    }
}
