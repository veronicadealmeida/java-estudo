package edu.vda.fiap;

import java.util.Scanner;

public class _13_CalculaIrEInss {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double salarioBruto;
        double salarioLiquido;
        double valorInss = 0;

        double tabelaUm = 1247.70;
        double aliquotaUm = 8.00;

        double tabelaDois = 2079.50;
        double aliquotaDois = 9.00;

        double tabelaTres = 4159.00;
        double aliquotaTres = 11.00;

        double tabelaQuatro = 4159.00;
        double valorTeto = 468.00;

        double valorIr = 0;

        double tabelaUmIr = 1710.78;

        double tabelaDoisIr = 2563.91;
        double aliquotaDoisIr = 7.5;

        double tabelaTresIr = 3418.59;
        double aliquotaTresIr = 15;

        double tabelaQuatroIr = 4271.59;
        double aliquotaQuatroIr = 22.5;

        double tabelaCincoIr = 4171.59;
        double aliquotaCincoIr = 27.5;

        System.out.println("Informe o salário:");

        salarioBruto = leitor.nextDouble();

        if (salarioBruto <= tabelaUm) {
            valorInss = salarioBruto / 100 * aliquotaUm;
        } else if (salarioBruto <= tabelaDois) {
            valorInss = salarioBruto / 100 * aliquotaDois;
        } else if (salarioBruto <= tabelaTres) {
            valorInss = salarioBruto / 100 * aliquotaTres;
        } else if (salarioBruto > tabelaQuatro) {
            valorInss = valorTeto;
        }

        // IR

        if (salarioBruto < tabelaUmIr) {
            valorIr = 0;
        }else if (salarioBruto < tabelaDoisIr) {
            valorIr = (salarioBruto / 100 * aliquotaDoisIr);
        } else if (salarioBruto < tabelaTresIr) {
            valorIr = (salarioBruto  / 100 * aliquotaTresIr);
        } else if (salarioBruto < tabelaQuatroIr) {
            valorIr = (salarioBruto / 100 * aliquotaQuatroIr);
        } else if (salarioBruto > tabelaCincoIr) {
            System.out.println(salarioBruto);
            valorIr = (salarioBruto / 100 * aliquotaCincoIr);
        }

        salarioLiquido = salarioBruto - valorIr - valorInss;
        System.out.println(salarioBruto + " " +  String.format("%.2f", valorInss) + " " +  String.format("%.2f", valorIr) + " " +  String.format("%.2f", salarioLiquido) );
    }

}
