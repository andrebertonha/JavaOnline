package br.com.abc.javacore.lambdas.interfaces;


import br.com.abc.javacore.lambdas.classes.Carro;

@FunctionalInterface
public interface CarroPredicate {
    boolean test(Carro carro);
    // (parametro) -> <expressao>
    // (Carro carro) -> carro.getCor().equals("verde"); //conforme assinatura do metodo
}
