package edu.vda.fiap;

import java.util.Scanner;

public class _07_VerificaAprovacaoENotaValida {
    public static void main(String[] args) {
        Scanner leitorUm = new Scanner(System.in);
        Scanner leitorDois = new Scanner(System.in);
        double notaUm;
        double notaDois;
        double mediaDasNotas;
        String mensagem;
        String validaNota;

        System.out.println("Informe duas notas:");

        validaNota = leitorUm.nextLine();
        if (validaNota.isEmpty()) {
            System.out.println("Nota inválida!");
            return;
        }

        notaUm = Double.parseDouble(validaNota);

        validaNota = "";

        validaNota = leitorDois.nextLine();

        if (validaNota.isEmpty()) {
            System.out.println("Nota inválida!");
            return;
        }

        notaDois =  Double.parseDouble(validaNota);

        if ((notaUm < 0 || notaDois < 0) || (notaUm < 0 && notaUm > 10) || (notaDois < 0 && notaDois > 10)){
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
