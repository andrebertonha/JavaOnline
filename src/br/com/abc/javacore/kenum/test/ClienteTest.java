package br.com.abc.javacore.kenum.test;

import br.com.abc.javacore.kenum.classes.Cliente;
import br.com.abc.javacore.kenum.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.APRAZO); //codigo fica mais seguro, a pessoa nao tem como passar um valor que nao foi definido
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
        System.out.println(TipoCliente.PESSOA_FISICA.getId());
        System.out.println(cliente);
    }
}
