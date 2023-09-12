package edu.vda.dio.desafios.bootcampjavacomcloudaws;

import java.util.Scanner;

public class RegrasEKS {
    public static void main(String[] args) {
        // Definindo as regras básicas
        int podsPorNode = 10;
        int podsPorServidor = 4;
        String mensagem = "";

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        int numeroTotalPods = scanner.nextInt();

        //TODO: Calcule o número mínimo de nodes necessários

        int numeroMinimoNodes = numeroTotalPods/ podsPorNode ;
        if (numeroTotalPods % podsPorNode != 0) {
            numeroMinimoNodes++;
        }





        //TODO: Calcule o número mínimo de servidores necessários
        int numeroMinimoServidores = numeroTotalPods / podsPorServidor;

        if (numeroTotalPods % podsPorServidor != 0) {
            numeroMinimoServidores++;
        }



        //TODO: Exiba o resultado com as recomendações de quantidades de servidores e nodes.

        if (numeroMinimoNodes == 1) {
            mensagem = "1.Recomendamos usar um unico node\n";
        } else {
            mensagem = "1.Numero minimo de nodes:" + numeroMinimoNodes + "\n";
        }

        if (numeroMinimoServidores == 1) {
            mensagem += "2.Recomendamos usar um unico servidor\n";
        } else {
            mensagem += "2.Numero minimo de servidores:" + numeroMinimoServidores + "\n";
        }

        System.out.println(mensagem);

                // Fechando o Scanner
        scanner.close();
    }
}
