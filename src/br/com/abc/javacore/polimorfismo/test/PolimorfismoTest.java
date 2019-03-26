package br.com.abc.javacore.polimorfismo.test;

import br.com.abc.javacore.polimorfismo.classes.Funcionario;
import br.com.abc.javacore.polimorfismo.classes.Gerente;
import br.com.abc.javacore.polimorfismo.classes.RelatorioPagamento;
import br.com.abc.javacore.polimorfismo.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Oswaldo", 5000, 2000);
        Vendedor v = new Vendedor("Yuri", 2000, 20000);

        RelatorioPagamento relatorio = new RelatorioPagamento();
//        relatorio.relatorioPagamentoGerente(g);
//        System.out.println("----------------------------------------");
//        relatorio.relatorioPagamentoVendedor(v);

        relatorio.relatorioPagamentoGenerico(g);
        System.out.println("----------------------------------------");
        relatorio.relatorioPagamentoGenerico(v);

    }
}
