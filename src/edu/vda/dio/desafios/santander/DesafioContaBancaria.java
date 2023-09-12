package edu.vda.dio.desafios.santander;

import java.util.Scanner;

public class DesafioContaBancaria {


    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();

        //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
        ContaBancariaa contaBancaria = new ContaBancariaa();

        contaBancaria.Bancariaa(numeroConta,nomeTitular,saldo);

        System.out.println("Informacoes:");
        System.out.println("Conta: " + String.format("%06d", contaBancaria.numero));
        System.out.println("Titular: " + contaBancaria.titular);
        System.out.println("Saldo: R$ " + contaBancaria.saldo);

    }
}

class ContaBancariaa {
    int numero;
    String titular;
    double saldo;


    public void Bancariaa(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
}