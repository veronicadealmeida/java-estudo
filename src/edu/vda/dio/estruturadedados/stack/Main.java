package edu.vda.dio.estruturadedados.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);

        // retira o último inserido na pilha
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        // mostra o últmo mas não retira
        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

        // verifica se a pilha está vazia
        System.out.println(stackCarros.empty());
    }
}
