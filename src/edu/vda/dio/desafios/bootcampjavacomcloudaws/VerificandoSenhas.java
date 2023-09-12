package edu.vda.dio.desafios.bootcampjavacomcloudaws;

import java.util.Scanner;
import java.util.regex.Pattern;

public class VerificandoSenhas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Digite a senha para verificar a força:");
        String senha = scanner.nextLine();
        //scanner.close();

        String resultado = verificarForcaSenha(senha);
        System.out.println(resultado);
    }

    public static String verificarForcaSenha(String senha) {
        int comprimentoMinimo = 8;
        String mensagem = "Sua senha atende aos requisitos de seguranca. Parabens!";

        // Critérios de validação usando expressões regulares
        boolean temLetraMaiuscula = Pattern.compile("[A-Z]").matcher(senha).find();
        boolean temLetraMinuscula = Pattern.compile("[a-z]").matcher(senha).find();
        boolean temNumero = Pattern.compile("\\d").matcher(senha).find();
        boolean temCaractereEspecial = Pattern.compile("\\W").matcher(senha).find();
        boolean temSequenciaComum = senha.matches(".*(?i)123456.*|.*(?i)abcdef.*");
        boolean temPalavraComum = senha.equalsIgnoreCase("password") || senha.equalsIgnoreCase("123456") || senha.equalsIgnoreCase("qwerty");

        if(senha.length() < comprimentoMinimo) {
            mensagem =  "Sua senha e muito curta. Recomenda-se no minimo 8 caracteres.";
        } else if (!temLetraMaiuscula) {
            mensagem =  "A senha deve conter pelo menos uma letra maiúscula (A-Z).";
        } else if (!temLetraMinuscula) {
            mensagem = "A senha deve conter pelo menos uma letra minúscula (a-z).";
        } else if (!temNumero) {
            mensagem = "A senha deve conter pelo menos um número (0-9).";
        } else if (!temCaractereEspecial || temSequenciaComum || temPalavraComum) {
            mensagem = "Sua senha nao atende aos requisitos de seguranca.";
        }

        return mensagem;

    }
}