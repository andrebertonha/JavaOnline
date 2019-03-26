package br.com.abc.javacore.sobrescrita.test;

import br.com.abc.javacore.sobrescrita.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Joaquina na esquina");
        p.setIdade(300);
        System.out.println(p);
        Pessoa p2 = new Pessoa();
        p2.setNome("Rogerio");
        p2.setIdade(40);
        System.out.println(p2);
    }
}
