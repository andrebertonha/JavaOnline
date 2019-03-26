package br.com.abc.javacore.padroesdeprojeto.classes;

public class MoedaFactory {
    public static Moeda criarMoeda(Pais pais) {
        if(pais.equals(Pais.BRASIL)){
            return new Real();
        }else if(pais.equals(Pais.EUA)){
            return new USDollar();
        }
        throw new IllegalArgumentException("Nao existe este país");
    }
}
