package br.com.abc.javacore.classesinternas.test;

import br.com.abc.javacore.generics.classes.Carro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Animal {
    public void andar(){
        System.out.println("animal andando");
    }
}
//manipular eventos swing do java java8 lambda
public class ClassesAnonimasTest {
    public static void main(String[] args) {
        Animal a = new Animal(){ //sobrescrever o metodo com classe anonima
            public void andar(){ //polimorfismo o que eh chamado eh o metodo andar do obj nao este
                System.out.println("andando anonimamente");
            }

        };
        a.andar();

        List<Carro> carrosList = new ArrayList<>();
        carrosList.add(new Carro("BMW"));
        carrosList.add(new Carro("Audi"));

        Collections.sort(carrosList, new Comparator<Carro>(){
            @Override
            public int compare(Carro o1, Carro o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        System.out.println(carrosList);
    }
}


