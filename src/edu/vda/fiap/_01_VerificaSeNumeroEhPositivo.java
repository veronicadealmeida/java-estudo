package edu.vda.fiap;

import java.util.Scanner;

public class _01_VerificaSeNumeroEhPositivo {
    public static void main(String[] args) {

        int numeroInformadoPeloUsuario;
        String mensagem = " ";

        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número inteiro e verifique se ele é positivo ou negativo");

        numeroInformadoPeloUsuario = leitor.nextInt();


        if (numeroInformadoPeloUsuario > 0) {
            mensagem = "O numero é positivo";
        } else {
            mensagem = "O numero não é positivo";
        }

        System.out.println(mensagem);
    }

}
