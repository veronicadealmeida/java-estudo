package edu.vda.fiap;

import java.util.Scanner;

public class _02_VerificaMaioridade {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int idade = 0;

        System.out.println("Informe a idade:");

        idade = leitor.nextInt();

        if (idade >= 18){
            System.out.println("Você é maior de Idade");
        } else {
            System.out.println("Você é menor de Idade");
        }
    }
}
