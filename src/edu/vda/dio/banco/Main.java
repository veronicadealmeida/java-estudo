package edu.vda.dio.banco;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();


        Cliente ve = new Cliente("Vê");
        Cliente lucas = new Cliente("Lucas");

        Conta ccVe = new ContaCorrente(ve);

        Conta poupancaVe = new ContaPoupanca(ve);

        Conta ccLucas = new ContaCorrente(lucas);

        ccVe.depositar(100);
        ccVe.transferir(40,poupancaVe);
        ccVe.transferir(10,ccLucas);



        ccVe.imprimirExtrato();
        poupancaVe.imprimirExtrato();
        ccLucas.imprimirExtrato();



        banco.getContas();
    }
}
