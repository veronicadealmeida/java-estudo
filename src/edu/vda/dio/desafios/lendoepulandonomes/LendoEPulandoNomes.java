package edu.vda.dio.desafios.lendoepulandonomes;
import java.util.Scanner;

public class LendoEPulandoNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// TODO: complete os espaços em branco com sua solução para o problema
        String[] nomes = new String[10];

        for(int i=0 ; i<10 ; i++){
            nomes[i] = sc.next();
        }
        System.out.println(nomes[2]);
        System.out.println(nomes[6]);
        System.out.println(nomes[8]);

    }
}
