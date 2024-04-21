package br.edu.uniaeso;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Escolha uma opção:");
        System.out.println("1. Adicionar novo produto");
        System.out.println("2. Atualizar produto existente");
        System.out.println("3. Excluir produto");

        int opcao = ler.nextInt();
        ler.nextLine();

        if (opcao == 1) {
            produto.adicionarNovoProduto(ler);
        } else if (opcao == 2) {
            produto.atualizarProdutoExistente(ler);
        } else if (opcao == 3) {
            produto.excluirProduto(ler);
        } else {
            System.out.println("Opção inválida!");
        }
        ler.close();
    }
}
