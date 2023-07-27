package edu.vda.dio.estruturadedados.list;

import javax.sql.rowset.CachedRowSet;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----List--------\n");

        List<Carro> carroList = new ArrayList<>();

//        ----------------------------------------------------------------------------------------------------
        System.out.println("\n--------> add - retorna true ou false");
        System.out.println(carroList);
        System.out.println(carroList.add(new Carro("Chevrolet")));

        carroList.add(new Carro("Fiat"));
        carroList.add(new Carro("Renault"));
        carroList.add(new Carro("Ford"));
        System.out.println(carroList);

//        ----------------------------------------------------------------------------------------------------
        System.out.println("\n--------> contains - retorna true ou false");
        System.out.println(carroList.contains(new Carro("Ford")));
        System.out.println(carroList.contains(new Carro("For")));
        System.out.println(carroList);

//        ----------------------------------------------------------------------------------------------------
        System.out.println("\n--------> get - busca elemente pelo índice e o retorna, caso não exista retorna um erro");
        System.out.println(carroList.get(2));
        System.out.println(carroList);

//        ----------------------------------------------------------------------------------------------------
        System.out.println("\n--------> indexOf - retorna o índice do elemento passado, caso não encontre, retorna -1");
        System.out.println(carroList.indexOf( new Carro("Fiat")));
        System.out.println(carroList.indexOf( new Carro("Fia")));


//        ----------------------------------------------------------------------------------------------------
        System.out.println("\n--------> remove - recebe o índice para remover, caso não encontre retorna um erro, caso " +
                "encontre, retorna o elemente removido");
        System.out.println(carroList);
        System.out.println(carroList.remove(2));
//        System.out.println(carroList.remove(22));
        System.out.println(carroList);
    }
}
