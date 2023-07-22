package edu.vda.fiap;

import java.util.Scanner;

public class _16_CalculaCobrancaDeConvenio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double salario;
        boolean masculino = true;
        int idade;
        double valorDoConvenio;

        int rangeUmDeIdade = 20;
        int rangeDoisDeIdade = 40;

        double rangeUmDeCobrancaMasculino = 5.34;
        double rangeUmDeCobrancaFeminino = 3.56;

        double rangeDoisDeCobrancaMasculino = 8.44;
        double rangeDoisDeCobrancaFeminino = 6.43;

        double rangeTresDeCobrancaMasculino = 10.12;
        double rangeTresDeCobrancaFeminino = 8.02;

        System.out.println("Informe o salário: ");
        salario = leitor.nextDouble();

        System.out.println("Informe o sexo (1 para Masculino e 2 para Feminino):");
        masculino = (leitor.next().equals("1"));

        System.out.println("Infome a idade:");
        idade = leitor.nextInt();

        if (idade <= rangeUmDeIdade ) {
            if (masculino) {
                valorDoConvenio = salario / 100 * rangeUmDeCobrancaMasculino;
            } else {
                valorDoConvenio = salario / 100 * rangeUmDeCobrancaFeminino;
            }

        } else if (idade <= rangeDoisDeIdade) {
            if (masculino) {
                valorDoConvenio = salario / 100 * rangeDoisDeCobrancaMasculino;
            } else {
                valorDoConvenio = salario / 100 * rangeDoisDeCobrancaFeminino;
            }

        } else {
            if (masculino) {
                valorDoConvenio = salario / 100 * rangeTresDeCobrancaMasculino;
            } else {
                valorDoConvenio = salario / 100 * rangeTresDeCobrancaFeminino;
            }
        }

        System.out.println("Valor do convênio R$ " + String.format("%.2f", valorDoConvenio));
    }
}
