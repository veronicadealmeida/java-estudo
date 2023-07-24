package edu.vda.dio.exemplos.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;

        intA = 2;

        System.out.println("intA " + intA); // 2
        System.out.println("intB " + intB); // 1

        MeuObjeto objA = new MeuObjeto(1);
        MeuObjeto objB = objA;

        objA.setNum(2);

        System.out.println("objA " + objA); // 2
        System.out.println("objB " + objB); // 2

    }
}
