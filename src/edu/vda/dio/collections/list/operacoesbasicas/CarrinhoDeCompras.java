package edu.vda.dio.collections.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhodeComprasList;

    public CarrinhoDeCompras(){
        carrinhodeComprasList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhodeComprasList.add( new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome) {

        List<Item> itensParaRemover = new ArrayList<>();

        for (Item i: carrinhodeComprasList ) {
            if (i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }

        carrinhodeComprasList.removeAll(itensParaRemover);

    }

    public double calcularValorTotal(){
        var soma = 0d;

        for (Item i: carrinhodeComprasList ) {
            soma += i.getPreco();
        }

        return soma;
    }

    public void exibirItens(){
        System.out.println(carrinhodeComprasList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("pão",3.80,1);
        carrinhoDeCompras.adicionarItem("margarinha",6.9,1);
        carrinhoDeCompras.adicionarItem("manteiga",13,1);
        carrinhoDeCompras.adicionarItem("manteiga",12,1);
        carrinhoDeCompras.adicionarItem("queijo",25,1);
        carrinhoDeCompras.adicionarItem("presunto",10,1);

        carrinhoDeCompras.exibirItens();

        System.out.println(carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("manteiga");

        System.out.println(carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.exibirItens();
    }

}
