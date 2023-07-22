package edu.vda.fiap;

import java.util.Scanner;

public class _14_OrdenacaoCrescente {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroUm;
        int numeroDois;
        int numeroTres;
        String mensagem = "";

        System.out.println("Informe 3 números inteiros:");

        numeroUm = leitor.nextInt();
        numeroDois = leitor.nextInt();
        numeroTres = leitor.nextInt();

        if (numeroUm <= numeroDois && numeroUm <= numeroTres) {
            mensagem += numeroUm;

            if (numeroDois <= numeroTres) {
                mensagem += " " + numeroDois +  " " + numeroTres;
            } else {
                mensagem += " " + numeroTres +  " " + numeroDois;
            }
        } else if (numeroDois <= numeroUm && numeroDois <= numeroTres) {
            mensagem += numeroDois;

            if (numeroUm <= numeroTres) {
                mensagem += " " + numeroUm +  " " + numeroTres;
            } else {
                mensagem += " " + numeroTres +  " " + numeroUm;
            }
        } else {
            mensagem += numeroTres;

            if (numeroUm <= numeroDois) {
                mensagem += " " + numeroUm +  " " + numeroDois;
            } else {
                mensagem += " " + numeroDois +  " " + numeroUm;
            }
        }

        System.out.println(mensagem);
    }
}
