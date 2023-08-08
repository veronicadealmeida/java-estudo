package edu.vda.dio.collections.set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private long cod;
    private String nome;
    private double preco;
    private int quantidade;


    public Produto(long cod, String nome, double preco, int quantidade) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public long getCod() {
        return cod;
    }
    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(cod, produto.cod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cod);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", codigo='" + cod + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
}

class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(),p2.getPreco());
    }
}