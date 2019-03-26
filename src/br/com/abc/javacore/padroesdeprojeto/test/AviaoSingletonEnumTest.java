package br.com.abc.javacore.padroesdeprojeto.test;


import br.com.abc.javacore.padroesdeprojeto.classes.AviaoSingletonEnum;

public class AviaoSingletonEnumTest {
    public static void main(String[] args) {
        AviaoSingletonEnum.agendarAssento("1A");
        AviaoSingletonEnum.agendarAssento("1A");
    }
}
