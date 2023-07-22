package edu.vda.fiap;

import java.util.Scanner;

public class _04_ExibeMaiorNumero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroUm;
        int numeroDois;

        System.out.println("Digite dois números inteiros:");

        numeroUm = leitor.nextInt();
        numeroDois = leitor.nextInt();

        if (numeroUm >= numeroDois) {
            System.out.println("O maior número digitado foi " + numeroUm);
        } else {
            System.out.println("O maior número digitado foi " + numeroDois);
        }
    }
}
