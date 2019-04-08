package br.com.abc.javacore.completablefuture.test;

import br.com.abc.javacore.completablefuture.classes.Loja;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class LojaTest {
    public static void main(String[] args) {
        Loja americanas = new Loja();
        Loja casasbahia = new Loja();
        Loja bestBuy = new Loja();
        Loja walMart = new Loja();
//        long start = System.currentTimeMillis();
//        System.out.println(americanas.getPreco());
//        System.out.println(casasbahia.getPreco());
//        System.out.println(bestBuy.getPreco());
//        System.out.println(walMart.getPreco());
//        System.out.println(System.currentTimeMillis() - start + " ms");
        long start = System.currentTimeMillis();

        Future<Double> precoAsync = americanas.getPrecoAsyncTunado();
        Future<Double> precoAsync1 = casasbahia.getPrecoAsyncTunado();
        Future<Double> precoAsync2 = bestBuy.getPrecoAsyncTunado();
        Future<Double> precoAsync3 = walMart.getPrecoAsyncTunado();
        long end = System.currentTimeMillis();
        System.out.println("Tempo de invocação: " + (end - start) + " ms");
        enrolando();
        try {
            System.out.println("Americanas " + precoAsync.get()); //3, TimeUnit.SECONDS no metodo get
            System.out.println("Casas Bahia " + precoAsync1.get());
            System.out.println("Best Buy " + precoAsync2.get());
            System.out.println("Wal Mart " + precoAsync3.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Tempo que levou para pegar o resultado " + (System.currentTimeMillis() - start) + " ms");

    }

    private static void enrolando() {
        long soma = 0;
        for (int i = 0; i < 1_000_000; i++) {
            soma += i;
        }
        System.out.println(soma);
    }
}
