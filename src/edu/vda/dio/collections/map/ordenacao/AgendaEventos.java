package edu.vda.dio.collections.map.ordenacao;


import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    Map<LocalDate, Evento> eventoMap = new HashMap<>();

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventoMap.put(data,new Evento(nome, atracao));
    }

    public void exibirAgenda(){

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);

        for ( Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento é : " +entry.getValue() + " acontecerá na data " + entry.getKey());
                break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        System.out.println(LocalDate.now());

        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JULY,15),"Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 7,9),"Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY,10),"Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.DECEMBER,10),"Evento 4", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.DECEMBER,10),"Evento 4", "Atração 4");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }


}
