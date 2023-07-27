package edu.vda.dio.estruturadedados.equalsehashcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Carro> carrosList = new LinkedList<>();

        carrosList.add( new Carro("FIAT"));
        carrosList.add( new Carro("Ford"));
        carrosList.add( new Carro("Chevrolet"));

        // verifica se já existe
        System.out.println(carrosList.contains(new Carro("Ford")));

        // motra o hash code
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford1").hashCode()); // diferente hash code

        // compara dois carros
        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Fiat");
        Carro carro3 = new Carro("Ford");

        System.out.println(carro1.equals(carro2));
        System.out.println(carro1.equals(carro3));
    }
}
