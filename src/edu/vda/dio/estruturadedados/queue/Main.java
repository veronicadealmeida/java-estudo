package edu.vda.dio.estruturadedados.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> queueCarros = new LinkedList<>();

        // principais métodos
        System.out.println("\n---- add() adiciona na fila, retorna true ou false");
        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println( queueCarros.add(new Carro("Peogeut")));

        System.out.println(queueCarros);

        System.out.println("\n---- offer() inclui no final da fila, retorna true ou false,  diferença do add é que ele " +
                "não retorna um erro quando não consegue adicionar");

        System.out.println(queueCarros.offer(new Carro("Renault 1")));
        queueCarros.offer(new Carro("Renault"));
        System.out.println(queueCarros);

        System.out.println("\n---- peek() mostra o primeiro da fila");
        System.out.println(queueCarros.peek()); // mostra o primeiro da pilha mas não remove
        System.out.println(queueCarros);

        System.out.println("\n---- poll() retorna o primeiro e o remove da fila");
        System.out.println(queueCarros);
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println("\n---- remove() retorna o primeiro da fila e o remove");
        System.out.println(queueCarros);
        System.out.println(queueCarros.remove());
        System.out.println(queueCarros);

        System.out.println("\n---- element() retorna o primeiro da fila");

        System.out.println(queueCarros.element());
        System.out.println(queueCarros);

        System.out.println("\n---- isEmpty() retorna true ou false");

        System.out.println(queueCarros.isEmpty());
    }
}
