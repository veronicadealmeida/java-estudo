package edu.vda.fiap;

import java.util.Scanner;

public class _08_VerificaSePositivoNegativoOuNulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero;


        System.out.println("Informe um número:");

        numero = leitor.nextInt();

        if (numero < 0) {
            System.out.println("Negativo");
        } else if (numero > 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Nulo");
        }
    }
}
