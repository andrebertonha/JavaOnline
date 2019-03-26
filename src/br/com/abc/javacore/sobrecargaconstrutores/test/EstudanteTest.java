package br.com.abc.javacore.sobrecargaconstrutores.test;

import br.com.abc.javacore.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("12312", "Andre", new double[]{5,7,9}, "11/02/2018");
        estudante.imprime();
    }
}
