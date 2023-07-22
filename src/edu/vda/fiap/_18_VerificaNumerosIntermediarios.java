package edu.vda.fiap;

import java.util.Scanner;

public class _18_VerificaNumerosIntermediarios {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numeroUm, numeroDois, NumeroTres, numeroIntermediario;

        System.out.println("Informe 3 números inteiros: ");

        numeroUm = leitor.nextInt();
        numeroDois = leitor.nextInt();
        NumeroTres = leitor.nextInt();

        if (numeroUm != numeroDois && NumeroTres !=numeroUm && numeroDois != NumeroTres) {
            if (numeroUm > numeroDois && numeroUm < NumeroTres) {
                numeroIntermediario = numeroUm;
            } else if (numeroDois > numeroUm && numeroDois < NumeroTres) {
                numeroIntermediario = numeroDois;
            } else {
                numeroIntermediario = NumeroTres;
            }
            System.out.println(numeroIntermediario);
        } else {
            System.out.println("Os números não sao diferentes");
        }
    }
}
