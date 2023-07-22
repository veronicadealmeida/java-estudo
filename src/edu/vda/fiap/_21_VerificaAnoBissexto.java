package edu.vda.fiap;

import java.util.Scanner;

public class _21_VerificaAnoBissexto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int ano;
        double restodaDivisaoPorQuatro, restodaDivisaoPorCem, restodaDivisaoPorQuatrocentos;

        System.out.println("Informe o ano com 4 dígitos:");

        ano = leitor.nextInt();

        restodaDivisaoPorQuatro = ano % 4;
        restodaDivisaoPorCem = ano % 100;
        restodaDivisaoPorQuatrocentos = ano % 400;
        if (restodaDivisaoPorQuatro == 0 && restodaDivisaoPorCem != 0 && restodaDivisaoPorQuatrocentos != 0 ) {
            System.out.println("É ano bissexto");
        } else {
            System.out.println("Não é ano bissexto");
        }

    }
}
