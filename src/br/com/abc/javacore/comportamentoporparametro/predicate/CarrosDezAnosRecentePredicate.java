package br.com.abc.javacore.comportamentoporparametro.predicate;

import br.com.abc.javacore.comportamentoporparametro.classes.Carro;
import br.com.abc.javacore.comportamentoporparametro.interfaces.CarroPredicate;

import java.util.Calendar;

public class CarrosDezAnosRecentePredicate implements CarroPredicate {
    @Override
    public boolean test(Carro carro) {
        return carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) - 10);
    }
}
