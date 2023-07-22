package edu.vda.fiap;

import java.util.Scanner;

public class _03_VerificaSeNumeroParOuImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero;
        int restoDaDivisao;

        System.out.println("Informe um número inteiro e verifique se ele é par ou ímpar:");

        numero = leitor.nextInt();
        restoDaDivisao = numero % 2;

        if (restoDaDivisao == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }
    }
}
