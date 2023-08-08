package edu.vda.dio.collections.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProduto() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod,String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valotTotaldoEstoque = 0d;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p: estoqueProdutosMap.values() ) {
                valotTotaldoEstoque += p.getPreco() * p.getQuantidade();
            }
        }

        return valotTotaldoEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        for (Produto p: estoqueProdutosMap.values()) {
            if (!estoqueProdutosMap.isEmpty()){
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }

        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Prodouto A", 10, 5d);
        estoque.adicionarProduto(2L, "Prodouto B", 5, 10d);
        estoque.adicionarProduto(3L, "Prodouto C", 2, 15d);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: " + estoque.calcularValorTotalEstoque());

        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
    }
}
