package br.com.abc.javacore.padroesdeprojeto.test;

import br.com.abc.javacore.padroesdeprojeto.classes.Aviao;

public class AviaoTest {
    public static void main(String[] args) {
        agendarAssento("1A");
        agendarAssento("1A");
    }

    public static void agendarAssento(String assento){
        Aviao a = new Aviao();
        System.out.println(a.bookAssento(assento));
    }
}
