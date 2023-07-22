package edu.vda.fiap;

import java.util.Scanner;

public class _11_CalculaInss {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double salario;
        double valorInss = 0;

        double tabelaUm = 1247.70;
        double aliquotaUm = 8.00;

        double tabelaDois = 2079.50;
        double aliquotaDois = 9.00;

        double tabelaTres = 4159.00;
        double aliquotaTres = 11.00;

        double tabelaQuatro = 4159.00;
        double valorTeto = 468.00;


        System.out.println("Informe o salário:");

        salario = leitor.nextDouble();

        if (salario <= tabelaUm) {
            valorInss = salario / 100 * aliquotaUm;
        } else if (salario <= tabelaDois) {
            valorInss = salario / 100 * aliquotaDois;
        } else if (salario <= tabelaTres) {
            valorInss = salario / 100 * aliquotaTres;
        } else if (salario > tabelaQuatro) {
            valorInss = valorTeto;
        }

        System.out.println( String.format("%.2f", valorInss) );
    }
}
