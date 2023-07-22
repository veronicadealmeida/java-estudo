package edu.vda.fiap;

import java.util.Scanner;

public class _20_VerificaTrianguloEquilatero {
    public static void main(String[] args) {
        Scanner leitor  = new Scanner(System.in);
        int valorUm, valorDois, ValorTres, SomaUmEDois, SomaDoisETres, SomaTreseUm;

        System.out.println("Infome 3 valores inteiros: ");
        valorUm = leitor.nextInt();
        valorDois = leitor.nextInt();
        ValorTres = leitor.nextInt();

        SomaUmEDois = valorUm + valorDois;
        SomaDoisETres = valorDois + ValorTres;
        SomaTreseUm = ValorTres + valorUm;
        if (SomaUmEDois > ValorTres && SomaDoisETres > valorUm && SomaTreseUm > valorDois){
            if (valorUm == valorDois && valorDois == ValorTres) {
                System.out.println("Triângulo Equilátero");
            } else if (valorUm == valorDois || valorDois == ValorTres) {
                System.out.println("Triângulo Isósceles");
            } else if (valorUm != valorDois && valorDois != ValorTres) {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Não forma um triângulo");
        }
    }
}
