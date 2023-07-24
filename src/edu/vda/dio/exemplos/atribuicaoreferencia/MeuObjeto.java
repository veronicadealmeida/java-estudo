package edu.vda.dio.exemplos.atribuicaoreferencia;

public class MeuObjeto {
    public MeuObjeto(Integer num) {
        this.num = num;
    }

    Integer num;

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }
}
