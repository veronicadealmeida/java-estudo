package edu.vda.fiap;

import java.util.Scanner;

public class __01_ApresentaODiaDaSemana {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int DiaDaSemana;

        System.out.println("Informe um inteiro e será apresentado o dia da semana correspondente.");
        DiaDaSemana  = leitor.nextInt();

        switch (DiaDaSemana){
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça-feira");
                break;
            case 4:
                System.out.println("quarta-feira");
                break;
            case 5:
                System.out.println("quinta-feira");
                break;
            case 6:
                System.out.println("sexta-feira");
                break;
            case 7:
                System.out.println("sábado");
                break;
        }
    }
}
