package edu.vda.dio.collections.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String,Integer> agendaContatnoMap;

    public AgendaContatos(){
        this.agendaContatnoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatnoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatnoMap.isEmpty()){
            agendaContatnoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatnoMap);
    }
    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;

        if (!agendaContatnoMap.isEmpty()) {
            numeroPorNome =  agendaContatnoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 111111);
        agendaContatos.adicionarContato("Camila", 444444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));
    }
}
