package cadastroProdutos;

import java.util.ArrayList;
import java.util.List;

public class SistemaCadastro {
    private List<Produto> produtos;

    public SistemaCadastro() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(String nome, double preco) {
        produtos.add(new Produto(nome, preco));
        System.out.println("Produto adicionado com sucesso!");
    }

    public void listarProdutos() {
        System.out.println("Lista de Produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void buscarProduto(String termo) {
        System.out.println("Resultados da busca por '" + termo + "':");
        for (Produto produto : produtos) {
            if (produto.getNome().toLowerCase().contains(termo.toLowerCase())) {
                System.out.println(produto);
            }
        }
    }

}
