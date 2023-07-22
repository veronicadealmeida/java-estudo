package edu.vda.fiap;

import java.util.Scanner;

public class _10_ExibeMaiorNumeroDeTres {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numeroUm;
        int numeroDois;
        int numeroTres;

        System.out.println("Infome 3 números inteiros:");

        numeroUm = leitor.nextInt();
        numeroDois = leitor.nextInt();
        numeroTres = leitor.nextInt();

        if (numeroUm >= numeroDois && numeroUm >=numeroTres) {
            System.out.println(numeroUm);
        } else if (numeroDois >= numeroUm && numeroDois >=numeroTres) {
            System.out.println(numeroDois);
        } else {
            System.out.println(numeroTres);
        }
    }
}
