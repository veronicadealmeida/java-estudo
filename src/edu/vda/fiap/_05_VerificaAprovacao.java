package edu.vda.fiap;

import java.util.Scanner;

public class _05_VerificaAprovacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double notaUm;
        double notaDois;
        double mediaDasNotas;
        String mensagem;

        System.out.println("Informe duas notas:");

        notaUm = leitor.nextDouble();
        notaDois = leitor.nextDouble();

        if (notaUm < 0 || notaDois < 0){
            System.out.println("Nota inválida!");
        } else {
            mediaDasNotas = (notaUm + notaDois) / 2;
            if (mediaDasNotas >= 5) {
                mensagem = "Você está aprovado";
            } else {
                mensagem = "Você está reprovado";
            }
            System.out.println(mediaDasNotas + " - " + mensagem);
        }

    }
}
