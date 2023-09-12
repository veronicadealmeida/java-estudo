package edu.vda.dio.desafios.santander;

import java.util.Scanner;

public class EquilibrandoOSaldo {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        float saldoAtual = leitor.nextFloat();
        float valorDeposito = leitor.nextFloat();
        float valorRetirada = leitor.nextFloat();



        //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
        var saldoFinal = saldoAtual + valorDeposito - valorRetirada;

        //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
        System.out.println("Saldo Atualizado na conta: " + String.format("%.1f", saldoFinal) );

    }


}
