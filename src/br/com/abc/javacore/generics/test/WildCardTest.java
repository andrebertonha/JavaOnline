package br.com.abc.javacore.generics.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal implements Comparable {
    @Override
    public void consulta() {
        System.out.println("consultando cachorro");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("consultando gato");
    }
}


public class WildCardTest {
    public static void main(String[] args) {
        Cachorro[] dogs = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
//        consultarAnimais(dogs);
//        consultarAnimais(gatos);
        List<Cachorro> cachorroList = new ArrayList<>();
        cachorroList.add(new Cachorro());
        List<Gato> gatoList = new ArrayList<>();
        gatoList.add(new Gato());

        consultarAnimaisList(cachorroList);
        consultarAnimaisList(gatoList);
        ordernarLista(cachorroList); //
    }

    public static void consultarAnimais(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    //type erasure | ? --> <? extends Animal>
    //pode ser uma lista de animal ou qualquer SUBclasse de animal -> coringa *
    public static void consultarAnimaisList(List<? extends Animal> animals) { //prometendo que depois nao vai inserir mais nada //erro em tempo de compilacao e nao exec
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    //definir metodos bem genericos
    public static void consultaCachorroList(List<? super Cachorro> cachorroList) {
        Cachorro c1 = new Cachorro();
        Animal a1 = new Cachorro();
        Object o = new Cachorro();
        cachorroList.add(new Cachorro());
    }

    // <List ?>  lista qualquer classe, e eh um comparable
    public static void ordernarLista(List<? extends Comparable> lista){
        Collections.sort(lista);
    }
}
