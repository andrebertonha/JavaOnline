package br.com.abc.javacore.padroesdeprojeto.test;

import br.com.abc.javacore.padroesdeprojeto.classes.Aviao;
import br.com.abc.javacore.padroesdeprojeto.classes.AviaoSingleton;

public class AviaoSingletonTest {
    public static void main(String[] args) {
        agendarAssento("1A");
        agendarAssento("1A");
    }

    public static void agendarAssento(String assento) {
        AviaoSingleton a = AviaoSingleton.getINSTANCE();
        System.out.println(a.bookAssento(assento));
    }
}
