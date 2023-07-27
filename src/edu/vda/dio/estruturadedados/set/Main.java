package edu.vda.dio.estruturadedados.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("------- HashSet (conjunto - não odrena pela ordem de inclusao)--------\n");
        Set<Carro> carroHashSet = new HashSet<>();

        //        ----------------------------------------------------------------------------------------------------
        System.out.println("\n--------> add - retorna true caso consiga adicionar");
        System.out.println(carroHashSet);
        System.out.println(carroHashSet.add( new Carro("Fiat")));
        carroHashSet.add( new Carro("Chevrolet"));
        carroHashSet.add( new Carro("Renault"));
        carroHashSet.add( new Carro("Ford"));
        carroHashSet.add( new Carro("Peogeut"));
        carroHashSet.add( new Carro("Zip"));
        System.out.println(carroHashSet);







        System.out.println("------- carroTreeSet (árvore, precisa implementar Comparable)--------\n");
        Set<Carro> carroTreeSet = new TreeSet<>();

        //        ----------------------------------------------------------------------------------------------------
        System.out.println("\n--------> add - retorna true caso consiga adicionar");
        System.out.println(carroTreeSet);
        System.out.println(carroTreeSet.add( new Carro("Fiat")));
        carroTreeSet.add( new Carro("Chevrolet"));
        carroTreeSet.add( new Carro("Renault"));
        carroTreeSet.add( new Carro("Peogeut"));
        carroTreeSet.add( new Carro("Ford"));
        carroTreeSet.add( new Carro("Alpha Romeo"));
        carroTreeSet.add( new Carro("Zip"));
        System.out.println(carroTreeSet);
    }
}
