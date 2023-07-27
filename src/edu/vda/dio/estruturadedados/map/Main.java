package edu.vda.dio.estruturadedados.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("======= Map (chave, valor) =======");

        Map<String, String> aluno1 = new HashMap<>();

        aluno1.put("Nome", "João");
        aluno1.put("Idade","17");
        aluno1.put("Media","8.5");
        aluno1.put("Turma","3a");

        System.out.println(aluno1);

        // retorna todas as chaves
        System.out.println(aluno1.keySet());

        // retorna todos o valores
        System.out.println(aluno1.values());



        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade","18");
        aluno2.put("Media","9.5");
        aluno2.put("Turma","3b");

        //-----------------------------------------------------------------------------------------
        System.out.println("====== Lista de Alunos do tipo Map<String, String> ======");
        List<Map<String, String>> listAlunos = new ArrayList<>();

        listAlunos.add(aluno1);
        listAlunos.add(aluno2);

        System.out.println(listAlunos);

        //-----------------------------------------------------------------------------------------
        System.out.println(aluno1.containsKey("Aluno"));
        System.out.println(aluno1.containsKey("Nome"));


    }
}
