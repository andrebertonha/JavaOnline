package br.com.abc.javacore.colecoes.test;

import br.com.abc.javacore.colecoes.classes.Produto;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {

        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0,10);
        Produto produto2 = new Produto("321", "Picanha", 26.4, 10);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0,0);
        Produto produto4 = new Produto("012", "Samsumg Galaxy S7 64GB", 3250.5,0);
        Produto produto5 = new Produto("012", "Samsumg Galaxy S6 64GB", 3250.5,0);
        Set<Produto> produtoSet = new HashSet<>(); //LinkedHashSet mantem a ordem de insercao //List permite elementos duplicados Set nao permite!
        produtoSet.add(produto1);
        produtoSet.add(produto2);
        produtoSet.add(produto3);
        produtoSet.add(produto4);
        //utiliza equals e hashcode (HashSet<>())
        produtoSet.add(produto5);

        for(Produto p : produtoSet){
            System.out.println(p);
        }

    }
}
