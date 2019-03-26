package br.com.abc.javacore.colecoes.test;

import br.com.abc.javacore.colecoes.classes.Consumidor;
import br.com.abc.javacore.colecoes.classes.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTest {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Andre Martins", "122");
        Consumidor consumidor2 = new Consumidor("empresa DevDojo", "321");
        Consumidor consumidor3 = new Consumidor("empresa DevDojo222", "321"); //se a chave for a mesma substitui os valores line33

        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000);
        Produto produto2 = new Produto("321", "Picanha", 26.4);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0);
        Produto produto4 = new Produto("012", "Samsumg Galaxy S7 64GB", 3250);

        Map<Consumidor, List<Produto>> map = new HashMap<>();
        List<Produto> produtosCon1 = new ArrayList<>();
        produtosCon1.add(produto1);
        produtosCon1.add(produto2);

        List<Produto> produtosCon2 = new ArrayList<>();
        produtosCon2.add(produto3);
        produtosCon2.add(produto4);

        map.put(consumidor, produtosCon1);
        map.put(consumidor2, produtosCon2);
        map.put(consumidor3, produtosCon1);

        for(Map.Entry<Consumidor,List<Produto>> entry : map.entrySet()){
            System.out.println(entry.getKey().getNome());
            for(Produto produto : entry.getValue()){
                System.out.println(produto.getNome());
            }
        }
    }
}
