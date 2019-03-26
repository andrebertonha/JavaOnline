package br.com.abc.javacore.generics.test;

import java.util.ArrayList;
import java.util.List;

//generics so existe em tempo de compilacao / certificacao tentarao enganar de td jeito
public class GenericsTest {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("String");
        lista.add("String");
        lista.add("andre master");

        for (String obj : lista){
            System.out.println(obj);
        }

        add(lista,1L);
    }

    public static void add(List lista, Long l) {
        lista.add(l);//compila mas contem warning nao recomendado
    }
}
