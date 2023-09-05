package cadastroProdutos;

import java.util.ArrayList;
import java.util.List;

public class SistemaCadastro {
    private List<Produto> produtos;

    public SistemaCadastro() {
        produtos = new ArrayList<>();
    }

    public boolean adicionarProduto(String nome, double preco) {
        if (produtos.add(new Produto(nome, preco))){
            System.out.println("Produto adicionado com sucesso!");
            return true;
        }else{
            return false;
        }
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
