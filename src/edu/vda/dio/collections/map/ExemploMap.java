package edu.vda.dio.collections.map;

import java.util.*;

import static javax.swing.UIManager.put;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("\nCrie um dicionário que relacione os modelos e seus respectivos consumos");

        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",14.2);
        }};
        System.out.println(carrosPopulares);

        System.out.println("\nSubstitua o consumo do gol por 15.2 km/l");
        carrosPopulares.put("gol",16.1);
        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o modelo tucson está adicionado");
        boolean constainsTucson = carrosPopulares.containsKey("tucson");
        boolean constainskwid = carrosPopulares.containsKey("kwid");
        System.out.println(constainsTucson);
        System.out.println(constainskwid);

        System.out.println("\nExiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("\n Exiba o terceiro modelo adicionado - não é possível");

        System.out.println("\nExiba os modelos");
        Set<String> strings = carrosPopulares.keySet();
        System.out.println(carrosPopulares);
        System.out.println(strings);

        System.out.println("\nExiba os consumos dos carros");
        Collection<Double> values = carrosPopulares.values();
        System.out.println(values);

        System.out.println("\nExiba o modelo mais eficiente e seu consumo");

        Double consumoMaisEficiente = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente  = "";

        for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
        System.out.println(modeloMaisEficiente + " - " + carrosPopulares.get(modeloMaisEficiente));
            };
        }
        System.out.println(carrosPopulares);

        System.out.println("\nExiba o modelo menos econômico e seu consumo");

    }
}
