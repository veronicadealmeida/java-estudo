package edu.vda.dio.funcionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso).
 * é comummente usada para filtrar os elementos do Stream com base em alguma condição.
 */
public class PredicateExemple {
    public static void main(String[] args) {

        // Criar uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // Usar o Stream para filtrar as palavras com mais de 5 caracteres e, sem seguida, imprimir cada uma
        palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);

        // com lambda
        palavras.stream().filter(p -> p.length() > 5).forEach(System.out::println);

    }
}
