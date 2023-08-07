package edu.vda.dio.collections.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdernacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdernacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add( new Pessoa(nome, idade,altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);

        return pessoasPorIdade;
    }

    public List<Pessoa> ordernarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura,new ComparatorPorAltura());

        return pessoasPorAltura;
    }




    public static void main(String[] args) {
        OrdernacaoPessoa ordernacaoPessoa = new OrdernacaoPessoa();

        System.out.println(ordernacaoPessoa);

        ordernacaoPessoa.adicionarPessoa("Victoria", 24, 1.66);
        ordernacaoPessoa.adicionarPessoa("Veronica", 41, 1.65);
        ordernacaoPessoa.adicionarPessoa("Lucas", 28, 1.75);
        ordernacaoPessoa.adicionarPessoa("Arthur", 8, 1.2);
        ordernacaoPessoa.adicionarPessoa("Gabriela", 12, 1.55);

        System.out.println(ordernacaoPessoa.pessoaList);

        System.out.println(ordernacaoPessoa.ordenarPorIdade());
        System.out.println(ordernacaoPessoa.ordernarPorAltura());
    }
}
