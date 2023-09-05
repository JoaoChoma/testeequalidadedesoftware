package cadastroProdutos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaCadastro sistema = new SistemaCadastro();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Buscar Produto");
            System.out.println("4 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do produto:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o preço do produto:");
                    double preco = scanner.nextDouble();
                    sistema.adicionarProduto(nome, preco);
                    break;
                case 2:
                    sistema.listarProdutos();
                    break;
                case 3:
                    System.out.println("Digite o termo de busca:");
                    String termoBusca = scanner.nextLine();
                    sistema.buscarProduto(termoBusca);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
