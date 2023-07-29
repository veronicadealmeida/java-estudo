package edu.vda.dio.collections.list;
/*
    Dadas as seguintes informações sobre meus gatos, cire uma lista e ordede está lista exibindo:
    (nome - idade - cor)
    gato 1 = nome:Jon , idade: 18, cor: preto
    gato 2 = nome:Simba , idade: 6, cor: tigrado
    gato 3 = nome:Jon , idade: 12, cor: amarelo
    gato 4 = nome:Jon , idade: 3, cor: amarelo
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add( new Gato("Jon", 18, "preto"));
            add( new Gato("Simba", 6, "tigrado") );
            add( new Gato("Jon", 12, "amarelo") );
            add( new Gato("Jon", 3, "amarelo") );
        }};


        System.out.println("\n\tOrdem de inserção");
        System.out.println(meusGatos);

        System.out.println("\n\tOrdem aleatória");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\n\tOrdem Natural (nome)");
        System.out.println(meusGatos);
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\n\tOrdem de idade");
//        meusGatos.sort( new ComparatorIdade()); // também funciona
        Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("\n\tOrdem de cor");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos)
        ;
        System.out.println("\n\tOrdem de nome/cor/idade");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        meusGatos.sort( new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato o1, Gato o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato o1, Gato o2) {
        return o1.getCor().compareToIgnoreCase(o2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato o1, Gato o2) {
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if (nome != 0) return nome;

        int cor = o1.getCor().compareToIgnoreCase(o2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(o1.getIdade(),o2.getIdade());
    }
}
class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }


    public String getCor() {
        return cor;
    }


    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
}