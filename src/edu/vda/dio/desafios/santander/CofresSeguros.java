package edu.vda.dio.desafios.santander;

import java.util.Scanner;
abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}
class CofreDigital extends Cofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends Cofre {

    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }

}

public class CofresSeguros {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();
        int senhaDigitadaUm;
        int senhaDigitadaDois;
        boolean senhaCorreta = false;

        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {
            senhaDigitadaUm = scanner.nextInt();
            senhaDigitadaDois = scanner.nextInt();
            CofreDigital cofre = new CofreDigital(senhaDigitadaUm);
            senhaCorreta = cofre.validarSenha(senhaDigitadaDois);

            System.out.println("Tipo: " + cofre.tipo);
            System.out.println("Metodo de abertura: " + cofre.metodoAbertura);

            if (senhaCorreta) {

                System.out.println("Cofre aberto!");
            } else {
                System.out.println("Senha incorreta!");
            }
        } else {
            CofreFisico cofre = new CofreFisico();
            System.out.println("Tipo: " + cofre.tipo);
            System.out.println("Metodo de abertura: " + cofre.metodoAbertura);
        }
    }
}