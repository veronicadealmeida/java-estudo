package edu.vda.dio.collections.map;

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("\nOrdem aleatória");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawkin, Stephen", new Livro("Uma Breve História do Tempo",238));
            put("Duhigg, Charles", new Livro("O Poder do Hábito",408));
            put("Harari, Yuval Noah", new Livro("21 Liçoes Para o Século 21",432));
        }};
        System.out.println(meusLivros);

        System.out.println("\nOrdem Inserção");
        Map<String, Livro> meusLivros2 = new LinkedHashMap<>(){{
            put("Hawkin, Stephen", new Livro("Uma Breve História do Tempo",238));
            put("Duhigg, Charles", new Livro("O Poder do Hábito",408));
            put("Harari, Yuval Noah", new Livro("21 Liçoes Para o Século 21",432));
        }};
        System.out.println(meusLivros2);


        System.out.println("\nOrdem alfabética autores");
        Map<String,Livro> meusLivros3 = new TreeMap<>(meusLivros);
        System.out.println(meusLivros3);

        System.out.println("\nOrdem alfabética nome dos livros");

        Set<Map.Entry<String,Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome());
        System.out.println(meusLivros4);
        meusLivros4.addAll(meusLivros.entrySet());
        System.out.println(meusLivros4);


        System.out.println("\nOrdem alfabética número de páginas");
        Set<Map.Entry<String,Livro>> meusLivros5 = new TreeSet<>(new ComparatorNumeroDePagina());
        System.out.println(meusLivros5);
        meusLivros5.addAll(meusLivros.entrySet());
        System.out.println(meusLivros5);
    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());

    }
}

class ComparatorNumeroDePagina implements Comparator <Map.Entry<String,Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return o1.getValue().getPaginas().compareTo(o2.getValue().getPaginas());
    }
}