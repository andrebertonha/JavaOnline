package br.com.abc.javacore.colecoes.test;

import br.com.abc.javacore.colecoes.classes.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListCelularTest {
    public static void main(String[] args) {
        Celular celular1 = new Celular("Galaxy S7","123456");
        Celular celular2 = new Celular("IPhone 6S","654632");
        Celular celular3 = new Celular("Sony XPeria","111555");
        List<Celular> celularList = new ArrayList<>();
        celularList.add(celular1);
        celularList.add(celular2);
        celularList.add(celular3);

        for(Celular celular : celularList){
            System.out.println(celular);
        }
        Celular celular4 = new Celular("Galaxy S7", "123456");
        System.out.println(celularList.contains(celular4));
    }
}
