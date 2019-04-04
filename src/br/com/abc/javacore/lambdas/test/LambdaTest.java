package br.com.abc.javacore.lambdas.test;


import br.com.abc.javacore.lambdas.classes.Carro;
import br.com.abc.javacore.lambdas.interfaces.CarroPredicate;

import java.util.function.Predicate;

public class LambdaTest {
    // anonima     // function     // passada por ai     // concisa
    // (Carro carro) -> carro.getCor().equals("verde")
    // (String s) -> s.length()
    // (int a, int b) -> sout(a+b)
    public static void main(String[] args) {
        CarroPredicate carroPredicate = new CarroPredicate() {
            @Override
            public boolean test(Carro carro) {
                return carro.getCor().equals("verde");
            }
        };

        Predicate<Carro> carroPredicate2 = (Carro carro) -> carro.getCor().equals("verde");
        System.out.println(carroPredicate.test(new Carro("verde", 2012)));
        System.out.println(carroPredicate2.test(new Carro("verde", 2012)));

        Runnable runnable = () -> System.out.println("dentro do run");
        //runnable.run();
        new Thread(runnable).start();

    }
}
