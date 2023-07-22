package edu.vda.fiap;

import java.util.Scanner;

public class __06_VerificaDiaDoRodizio {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int placaInformadaPeloUsuario;
        String ultimoDigitoDaPlaca;

        System.out.println("Informe os 4 últimos números da plcada do carro e informaremos o dia do rodízio veicular:");

        placaInformadaPeloUsuario = leitor.nextInt();
        ultimoDigitoDaPlaca = "" + placaInformadaPeloUsuario ;
        ultimoDigitoDaPlaca = ultimoDigitoDaPlaca.substring(3,4);

        switch (ultimoDigitoDaPlaca) {
            case "1":
            case "2":
                System.out.println("Segunda-feira");
                break;
            case "3":
            case "4":
                System.out.println("Terça-Feira");
                break;
            case "5":
            case "6":
                System.out.println("Quarta-feira");
                break;
            case "7":
            case "8":
                System.out.println("Quinta-feira");
                break;
            case "9":
            case "0":
                System.out.println("Sexta-feira");
                break;
        }
    }
}
