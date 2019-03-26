package br.com.abc.javacore.comportamentoporparametro.interfaces;

import br.com.abc.javacore.comportamentoporparametro.classes.Carro;
@FunctionalInterface
public interface CarroPredicate {
    boolean test(Carro carro);
    // (parametro) -> <expressao>
    // (Carro carro) -> carro.getCor().equals("verde"); //conforme assinatura do metodo
}
