package edu.vda.dio.funcionalinterface;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos
 */
public class FunctionExemple {
    public static void main(String[] args) {

        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        // Usar a Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero *2;

        List<Integer> numerosDobrados = numeros.stream().map(dobrar).toList();
        // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        List<Integer> numerosDobrados2 = numeros.stream().map(n -> n* 2).toList();

        // Imprimir a lista de números dobrados
        numerosDobrados.forEach(System.out::println);
        numerosDobrados2.forEach(System.out::println);
    }
}
