package br.com.abc.javacore.colecoes.test;

import br.com.abc.javacore.exception.checkedexceptions.classes.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Andre");
        nomes.add("devDojo");
        nomes2.add("Andre2");
        nomes2.add("devDojo2");
//        System.out.println("size: "+nomes.size());
//        System.out.println(nomes.remove("devDojo"));
//        System.out.println("size: "+nomes.size());
        nomes.clear();
        nomes.addAll(nomes2);
        int size = nomes.size();

        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        for(Integer num : numeros){
            System.out.println(num);
        }

    }
}
