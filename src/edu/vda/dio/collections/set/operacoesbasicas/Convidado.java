package edu.vda.dio.collections.set.operacoesbasicas;

import java.util.Objects;

public class Convidado {

    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoconvite() {
        return codigoConvite;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", codigoconvite=" + codigoConvite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codigoConvite == convidado.codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoConvite);
    }
}
