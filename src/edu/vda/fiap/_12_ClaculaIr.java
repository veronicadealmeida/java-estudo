package edu.vda.fiap;

import java.util.Scanner;

public class _12_ClaculaIr {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double salario;
        double valorIr = 0;

        double tabelaUm = 1710.78;

        double tabelaDois = 2563.91;
        double aliquotaDois = 7.5;
        double deducaoDois = 128.31;

        double tabelaTres = 3418.59;
        double aliquotaTres = 15;
        double deducaoTres = 320.60;

        double tabelaQuatro = 4271.59;
        double aliquotaQuatro = 22.5;
        double deducaoQuatro = 577.00;

        double tabelaCinco = 4171.59;
        double aliquotaCinco = 27.5;
        double deducaoCinco = 790.58;

        System.out.println("Informe seu salário:");

        salario = leitor.nextDouble();

        if (salario < tabelaUm) {
            valorIr = 0;
        }else if (salario < tabelaDois) {
            valorIr = (salario / 100 * aliquotaDois)  - deducaoDois;
        } else if (salario < tabelaTres) {
            valorIr = (salario  / 100 * aliquotaTres) - deducaoTres;
        } else if (salario < tabelaQuatro) {
            valorIr = (salario / 100 * aliquotaQuatro) - deducaoQuatro;
        } else if (salario > tabelaCinco) {
            System.out.println(salario);
            valorIr = (salario / 100 * aliquotaCinco) - deducaoCinco;
        }

        System.out.println( String.format("%.2f", valorIr) );
    }
}
