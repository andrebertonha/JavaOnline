package br.com.abc.javacore.lambdas.test;

import br.com.abc.javacore.lambdas.classes.Carro;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.*;
//prog funcional - consumer function predicate
import static java.util.Arrays.asList;

public class LambdaTest2 {
    public static void main(String[] args) {
        forEach(asList("André", "DevDojo", "William"), (String s) -> System.out.println(s));
        List<Integer> list = map(asList("André", "DevDojo", "William"), (String s) -> s.length());
        List<Carro> carros = asList(new Carro("Preto", 2011), new Carro("Branco", 2012), new Carro("Verde", 2013));
        List<String> listCores = map(carros, (Carro c) -> c.getCor());
        System.out.println(list);
        Predicate<Integer> pares = (Integer i) -> i % 2 == 0;
        IntPredicate impar = (int i) -> i % 2 == 1;
        System.out.println(pares.test(1000));
        System.out.println(impar.test(1000));
//        Callable<Integer> c = () -> 100;
//        PrivilegedAction<Integer> p = () -> 100;
        //statment expression

        Predicate<String> p = (String s) -> listCores.add(s);
        // o java ja interpreta (ja esta implicito) que o parametro sera uma string
        Consumer<String> b = s -> listCores.add(s);
        b.accept("AMARELO");
        Supplier<String> sup1 = () -> "teste";
        Supplier<Carro> sup2 = () -> new Carro("PRETO", 2000);
//        System.out.println(listCores);
        System.out.println(sup2.get().getCor());
    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T e : list) {
            c.accept(e);
        }
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            result.add(f.apply(e));
        }
        return result;
    }
}
