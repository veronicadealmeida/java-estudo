package edu.vda.fiap;

import java.util.Scanner;

public class __04_Calculadora {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double numeroUm, numeroDois, resultado = 0.0;
        String operacao;


        System.out.println("Informe a operação (+, -, *[ou X ou x ou .], /) " +
                "\n E dois números:");

        operacao = leitor.nextLine();
        numeroUm = leitor.nextDouble();
        numeroDois = leitor.nextDouble();


        switch (operacao) {
            case "+":
                resultado = soma(numeroUm, numeroDois);
                break;
            case "-":
                resultado = subtracao(numeroUm, numeroDois);
                break;
            case "/":
                if (numeroDois == 0) {
                    System.out.println("Não há divisão por zero");
                    return;
                } else {
                    resultado = divisao(numeroUm, numeroDois);
                }
                break;
            case "x":
                resultado = multiplicacao(numeroUm, numeroDois);
                break;
            case "X":
                resultado = multiplicacao(numeroUm, numeroDois);
                break;
            case "*":
                resultado = multiplicacao(numeroUm, numeroDois);
                break;
            default:
                System.out.println("Operação inválida");
                return;
        }

        System.out.println(resultado);
    }

    static public double soma(double a, double b) {
        return a + b;
    }

    static public double subtracao(double a, double b) {
        return a - b;
    }

    static public double multiplicacao(double a, double b) {
        return a * b;
    }

    static public double divisao(double a, double b) {
        return a / b;
    }
}