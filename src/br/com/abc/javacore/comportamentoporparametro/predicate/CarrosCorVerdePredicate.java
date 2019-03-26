package br.com.abc.javacore.comportamentoporparametro.predicate;

import br.com.abc.javacore.comportamentoporparametro.classes.Carro;
import br.com.abc.javacore.comportamentoporparametro.interfaces.CarroPredicate;

public class CarrosCorVerdePredicate implements CarroPredicate {

    @Override
    public boolean test(Carro carro) {
        return carro.getCor().equals("verde");
    }
}
