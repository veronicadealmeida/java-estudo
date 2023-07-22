package edu.vda.fiap;

import java.util.Scanner;

public class _17_CalculaMediaDaAv1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double provaUm;
        double provaDois;
        int atividadeUm;
        int atividadeDois;
        int atividadeTres;
        int atividadeQuatro;
        double mediaDasProvas;
        int mediadasAtividades;
        double mediaTotal;

        System.out.println("Informe as notas das 2 provas e 4 atividades, nesta ordem:");

        provaUm = leitor.nextDouble();
        provaDois = leitor.nextDouble();
        atividadeUm = leitor.nextInt();
        atividadeDois = leitor.nextInt();
        atividadeTres = leitor.nextInt();
        atividadeQuatro = leitor.nextInt();

//        mediaDasProvas = ((provaUm + provaDois) / 2) ;
        mediaDasProvas = (((provaUm + provaDois) / 2) / 100) * 60;
        mediadasAtividades = atividadeUm + atividadeDois + atividadeTres + atividadeQuatro ;

        mediaTotal = mediaDasProvas + mediadasAtividades;

        if (mediaTotal < 6 ) {
            System.out.println( "AV1 = " + String.format("%.1f", mediaTotal)  + ", você está abaixo da média.");
        } else if (mediaTotal == 6) {
            System.out.println( "AV1 = " + String.format("%.1f", mediaTotal) + ", você está na média.");
        } else {
            System.out.println( "AV1 = " + String.format("%.1f", mediaTotal) + ", você está acima da média.");
        }
    }
}
