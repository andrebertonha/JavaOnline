package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante andre = new Estudante();

        andre.setNome("André");
        andre.setIdade(32);
        andre.setNotas(new double[]{7,8.5,9});


        andre.imprimirDadosAluno();
        andre.tirarMedia();
        System.out.println("Aprovado? "+andre.isAprovado());

    }
}
