package edu.vda.fiap;

import java.util.Scanner;

public class _06_VerificaNotaValida {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double nota;


        System.out.println("Informe uma nota:");

        nota = leitor.nextDouble();


        if (nota >= 0 && nota <= 10) {
            System.out.println("Nota válida");
        } else {
            System.out.println("Nota Inválida");
        }
    }
}
