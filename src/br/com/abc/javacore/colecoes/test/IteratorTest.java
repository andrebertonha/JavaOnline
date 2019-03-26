package br.com.abc.javacore.colecoes.test;

import br.com.abc.javacore.colecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Produto> produtos = new LinkedList<>();
        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0,10);
        Produto produto2 = new Produto("321", "Picanha", 26.4, 10);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0,0);
        Produto produto4 = new Produto("012", "Samsumg Galaxy S7 64GB", 3250.5,0);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        //nao usar remove dentro de um for porque nao pode ter certeza do resultado
        //nao pode mudar um array em tempo de execucao
        Iterator<Produto> produtoIterator = produtos.iterator();
        //hasNext(); next();
        while(produtoIterator.hasNext()){

            if(produtoIterator.next().getQuantidade() == 0){
                produtoIterator.remove();
            }
        }
        System.out.println(produtos.size());



    }
}
