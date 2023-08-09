package edu.vda.dio.funcionalinterface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nhenhum argumento e retorna um resultado do tipo T
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExemple {

    public static void main(String[] args) {

        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)!";

        List<String> listaSaudacoes = Stream.generate(saudacao).limit(5).toList();

        // Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes2 = Stream.generate(()-> "Olá com supplier").limit(2).toList();

        // Imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);
        listaSaudacoes2.forEach(System.out::println);
    }
}
