package edu.vda.dio.funcionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        // usar binary operator com expressão lambda para somar dois numeros inteiros
        BinaryOperator<Integer> somar = (num1,num2) -> num1 + num2;
        BinaryOperator<Integer> somar2 = Integer::sum;

        // usar o binaryOperator par somar todos os números no Stream
        int resultado = numeros.stream().reduce(0,somar);

        int resultado2 = numeros.stream().reduce(0,Integer::sum);

        // imprimir
        System.out.println("A soma dos números é: " + resultado);
        System.out.println("A soma dos números é: " + resultado2);
    }
}
