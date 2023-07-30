package edu.vda.dio.collections.set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

//        Dada uma lista com 7 notas de um aluno [7. 8.5, 9.3, 5, 7, 0, 6.3], faça:

        System.out.println("\n\tCrie um conjuntdo e adicione as notas: ");

        Set<Double> notas = new HashSet<>(
                Arrays.asList(7.0, 8.5, 9.3, 5d, 7d, 0d)
        );
        notas.add(6.3);
        System.out.println(notas.toString());

        System.out.println("\n\tExiba a posição da nota 5");
        System.out.println("não é possivel fazer pois não possui índice");

        System.out.println("\n\tAdicione na lista a nota 8.0 na posição 4");
        System.out.println("não é possivel fazer pois não possui índice");

        System.out.println("\n\tSubstitua a nota 5.0 pela nota 6.0");
        System.out.println("não é possivel fazer pois não possui índice");

        System.out.println("\n\tConfira se a nota 5.0 está no conjunto");
        System.out.println(notas.contains(5.0));

        System.out.println("\n\tExiba a terceira nota adicionada");
        System.out.println("não é possivel fazer pois não possui índice");

        System.out.println("\n\tExiba a menor nota");
        System.out.println(Collections.min(notas));

        System.out.println("\n\tExiba a maior nota");
        System.out.println(Collections.max(notas));

        System.out.println("\n\tExiba a soma dos valores");
        Iterator<Double> iterator = notas.iterator();
        Double soma  = 0d;

        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("\n\tExiba a média das notas: " + (soma / notas.size()));

        System.out.println("\n\tRemova a nota 0");
        System.out.println(notas);
        System.out.println(notas.remove(0d));
        System.out.println(notas);

        System.out.println("\n\tRemova a nota da posição 0");
        System.out.println("não é possivel fazer pois não possui índice");

        System.out.println("\n\tExiba todas as notas na ordem em que foram adicionadas:");
        Set<Double> notas2 = new LinkedHashSet<>();

        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);

        System.out.println(notas2);

        System.out.println("\n\tExiba as notas na ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas2);
        System.out.println(notas3);

        System.out.println("\n\tApaque todo o conjunto");
        System.out.println(notas);
        notas.clear();
        System.out.println(notas);

        System.out.println("\n\tConfira se o conjunto está vazio");
        System.out.println(notas.isEmpty());
        System.out.println(notas2.isEmpty());
        System.out.println(notas);
    }
}
