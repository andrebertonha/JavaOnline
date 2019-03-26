package br.com.abc.javacore.padroesdeprojeto.test;

import br.com.abc.javacore.padroesdeprojeto.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa.PessoaBuilder("André")
                .apelido("master")
                .nomeDoMeio("Bertonha")
                .nomeDoPai("Helio")
                .ultimoNome("Martins")
                .build();

        System.out.println(p);
    }
}
