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

    public String listarProdutos() {
        String saida = "Lista de Produtos:\n";

        for (Produto produto : produtos) {
            saida += produto.toString()+"\n";
        }
        return saida;
    }

    public String buscarProduto(String termo) {
        String saida = "Resultados da busca por '" + termo + "':\n";
        for (Produto produto : produtos) {
            if (produto.getNome().toLowerCase().contains(termo.toLowerCase())) {
                saida += produto.toString()+"\n";
            }
        }
        return saida;
    }

}
