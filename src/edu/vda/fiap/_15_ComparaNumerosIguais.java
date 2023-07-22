package edu.vda.fiap;

import java.util.Scanner;

public class _15_ComparaNumerosIguais {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numeroUm;
        int numeroDois;
        int numeroTres;
        int quantidadeDeNumerosIguais = 0;
        int quantidadeDeNumerosDiferentes = 0;

        System.out.println("Informe 3 números inteiros:");

        numeroUm = leitor.nextInt();
        numeroDois = leitor.nextInt();
        numeroTres = leitor.nextInt();

        if (numeroUm == numeroDois) {
            if (numeroDois == numeroTres) {
                quantidadeDeNumerosIguais = 3;
                quantidadeDeNumerosDiferentes = 0;
            }

        } else if (numeroUm != numeroDois && numeroDois != numeroTres && numeroUm != numeroTres) {
            quantidadeDeNumerosIguais = 0;
            quantidadeDeNumerosDiferentes = 3;
        } else if (numeroUm == numeroDois || numeroDois == numeroTres || numeroUm == numeroTres) {
            quantidadeDeNumerosIguais = 2;
            quantidadeDeNumerosDiferentes = 1;
        }

        if (quantidadeDeNumerosDiferentes == 3) {
            System.out.println(quantidadeDeNumerosDiferentes + " números diferentes");
        } else if (quantidadeDeNumerosIguais == 3) {
            System.out.println(quantidadeDeNumerosIguais + " números iguais");
        } else{
            System.out.println(quantidadeDeNumerosIguais + " dos " + (quantidadeDeNumerosDiferentes + quantidadeDeNumerosIguais) + " são iguais");
        }
    }
}
