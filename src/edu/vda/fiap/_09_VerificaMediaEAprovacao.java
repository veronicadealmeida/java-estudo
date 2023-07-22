package edu.vda.fiap;

import java.util.Scanner;

public class _09_VerificaMediaEAprovacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double notaAv1;
        double notaAv2;
        double notaAv3;
        double media = 0.0;
        String mensagem;

        System.out.println("Informe as notas da AV1, AV2 e AV3:");

        notaAv1 = leitor.nextDouble();
        notaAv2 = leitor.nextDouble();
        notaAv3 = leitor.nextDouble();

        if (notaAv1 >= notaAv2) {
            if (notaAv2 < notaAv3) {
                notaAv2 = 0.0;
            } else {
                notaAv3 = 0.0;
            }
        } else {
            if (notaAv1 >= notaAv3) {
                notaAv3 = 0.0;

            } else  {
                notaAv1 = 0.0;

            }
        }

        media = (notaAv1 + notaAv2 + notaAv3) / 2;

        if (media < 6) {
            mensagem = "Reprovado";
        } else {
            mensagem = "Aprovado";
        }
        System.out.println(media + " - " + mensagem);

    }
}
