package edu.vda.dio.collections.list;


import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        System.out.println("Cire uma lista e adicione a sete notas:");
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

//        System.out.println(notas);
        System.out.println(notas.toString());

        System.out.println("\nExiba a posição da nota 5");
        System.out.println(notas.indexOf(5d));

        System.out.println("\nAdicione na lista a nota 8.0 na posição 4:");
        notas.add(4,8d);
        System.out.println(notas.toString());


        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0:");
        System.out.println(notas);
        notas.set(notas.indexOf(5d),6d);
        System.out.println(notas);

        System.out.println("\nConfira se a nota 5.0 está na lista:");
        System.out.println(notas.contains(5d));

        System.out.println("\nExiba todas as notas na ordem em que foram informadas");
        System.out.println(notas);

        for (Double nota: notas) {
            System.out.println(nota);
        }

        System.out.println("\nExiba a terceira nota adicionada");
        System.out.println(notas.toString());
        System.out.println(notas.get(2));

        System.out.println("\nExiba a menor nota");
        System.out.println(Collections.min(notas));
        System.out.println(notas);

        System.out.println("\nExiba a maior nota");
        System.out.println(Collections.max(notas));

        System.out.println("\nExiba a soma dos valores");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma+= next;
        }
        System.out.println(soma);

        System.out.println("\nExiba a média das notas: " + (soma/notas.size()));

        System.out.println("\n Remova a nota 0");
        System.out.println(notas);
//        notas.remove(notas.indexOf(0d));
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("\nRemova a nota na posição 0");
        System.out.println(notas);
        notas.remove(0);
        System.out.println(notas);

        System.out.println("\nRemova as notas menores que 7 e exiba a lista");
        System.out.println(notas);
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();

        }
        System.out.println(notas);

        System.out.println("\nConfira se a ista está vazia");
        System.out.println(notas.isEmpty());

        System.out.println("\nApague toda a lista");
        System.out.println(notas);
        notas.clear();
        System.out.println(notas);

        System.out.println("\nConfira se a lista está vazia");
        System.out.println(notas.isEmpty());

//        -----------------------------------------------------------------
//        Usando LinkedList
        System.out.println("\nCrie uma lista chamada notas2");
        List<Double> notas2 = new LinkedList<>();
        notas2.add(8d);
        notas2.add(5.0);
        notas2.add(6.5);
        notas2.add(9.0);
        notas2.add(10.0);
        notas2.add(5.4);
        notas2.add(0.0);

        System.out.println(notas2);

        System.out.println("\nMostre a primeira nota da nova lista sem remmovê-lo: " + notas2.get(0));
        System.out.println(notas2);

        System.out.println("\nMostre a primeira nota da lista removendo-o: " + notas2.remove(0));
        System.out.println(notas2);

    }
}
