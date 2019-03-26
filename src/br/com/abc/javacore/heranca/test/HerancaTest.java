package br.com.abc.javacore.heranca.test;

import br.com.abc.javacore.heranca.classes.Endereco;
import br.com.abc.javacore.heranca.classes.Funcionario;
import br.com.abc.javacore.heranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {

//        Pessoa p = new Pessoa("Gina");
        Endereco end = new Endereco();
//
//        p.setCpf("12345");
//        end.setBairro("Vila Industrial");
        end.setRua("Julio Fernandes");
//        p.setEndereco(end);
//        p.imprime();

        System.out.println("----------------------------------");
        Funcionario func = new Funcionario("Augusto");

        func.setCpf("98765");
        func.setSalario(15000);
        func.setEndereco(end);
//        func.imprime();


    }
}
