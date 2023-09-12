package edu.vda.dio.desafios.bootcampjavacomcloudaws;

import java.util.*;
import java.util.stream.Collectors;

public class MonitoramentoLogsAWS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Map<String, Long> eventosPorServico = new HashMap<>();
        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
            String servico = parts[1];
            //TODO: Utilize o mapa para registrar/incrementar o serviço em questão.
            if (eventosPorServico.containsKey(servico)) {
                eventosPorServico.put( servico, eventosPorServico.get(servico) + 1L);
            } else {

                eventosPorServico.put( servico, 1L);
            }
        }

        //TODO: Identifique no mapa os serviços com maior e menor quantidade de logs.
        //      Dica: Utilize Java Streams para tornar essa tarefa mais simples.
        var menor = eventosPorServico.entrySet().stream().max(new Comparator<Map.Entry<String, Long>>() {
            @Override
            public int compare(Map.Entry<String, Long> o1, Map.Entry<String, Long> o2) {
                if (o1.getValue() > o2.getValue()) {
                    return -1;
                } else if (o1.getValue() < o2.getValue()) {
                    return 1;
                }
                return 0;
            }
        });

        var maior = eventosPorServico.entrySet().stream().max(new Comparator<Map.Entry<String, Long>>() {
            @Override
            public int compare(Map.Entry<String, Long> o1, Map.Entry<String, Long> o2) {
                if (o1.getValue() > o2.getValue()) {
                    return 1;
                } else if (o1.getValue() < o2.getValue()) {
                    return -1;
                }
                return 0;
            }
        });


        //TODO: Imprima a saída no padrão definido no enunciado deste desafio.
        Set<Map.Entry<String, Long>> entries = eventosPorServico.entrySet();

        System.out.println("Eventos por servico:");

        for (Map.Entry<String, Long> entry: entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        };
        System.out.println("Maior:" + maior.get().getKey());
        System.out.println("Menor:" + menor.get().getKey());
    }
}

class Log{
    private String Log;
    private int ocorrencias;

    public String getLog() {
        return Log;
    }

    public Log(String log, int ocorrencias) {
        Log = log;
        this.ocorrencias = ocorrencias;
    }

    public void setLog(String log) {
        Log = log;
    }

    public int getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(int ocorrencias) {
        this.ocorrencias = this.ocorrencias ++;
    }
}