package edu.vda.dio.collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {

    private List<Livro> livroList;

    public CatalogoLivro() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano){
        livroList.add(new Livro(titulo,autor,ano));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livroComAutor = new ArrayList<>();

        if (!livroList.isEmpty()) {

            for (Livro l: livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livroComAutor.add(l);
                }
            }
        }

        return livroComAutor;
    }

    public void exibirCatalogoLivro(){
        System.out.println(livroList);
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livroPorIntervaloDeAno = new ArrayList<>();

        if (!livroList.isEmpty()) {

            for (Livro l: livroList ) {
                if (l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoFinal ) {
                    livroPorIntervaloDeAno.add(l);
                }
            }
        }

        return livroPorIntervaloDeAno;

    }

    public List<Livro> pesquisarPorTitulo(String titulo) {
        List<Livro> livroComTitulo = new ArrayList<>();

        if (!livroList.isEmpty()){

            for (Livro l: livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroComTitulo.add(l);
                }
            }
        }

        return livroComTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivro catalogoLivroList = new CatalogoLivro();

        catalogoLivroList.adicionarLivro("Livro 1","autor 1", 2021);
        catalogoLivroList.adicionarLivro("Livro 2","autor 3", 2022);
        catalogoLivroList.adicionarLivro("Livro 2","autor 1", 2023);
        catalogoLivroList.adicionarLivro("Livro 4","autor 7", 1877);

        catalogoLivroList.exibirCatalogoLivro();

        var livrosAutor1 = catalogoLivroList.pesquisarPorAutor("autor 1");
        System.out.println(livrosAutor1.toString());

        var livrosAutor5 = catalogoLivroList.pesquisarPorAutor("autor 5");
        System.out.println(livrosAutor5.toString());

        var livrosPorIntervaloDeAno = catalogoLivroList.pesquisarPorIntervaloAnos(2022,2025);
        System.out.println(livrosPorIntervaloDeAno);

        var livrosTitlo2 = catalogoLivroList.pesquisarPorTitulo("Livro 2");
        System.out.println(livrosTitlo2.toString());
    }
}
