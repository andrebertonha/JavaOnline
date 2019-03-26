package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {


        Calculadora.somaDoisNumeros();
        Calculadora.subtraiDoisNumeros();
        Calculadora.multiplicaDoisNumeros(55.5,5);
        System.out.println("divisao de 2 numeros");
        double result = Calculadora.divideDoisNumeros(20,5);
        System.out.println(result);
        System.out.println("Imprimindo 2 numeros divididos----");
        Calculadora.imprimeDoisNumerosDivididos(20,5);
        System.out.println("continuando a execucao");

        int[] numeros = {1,2,3,4,5};
        Calculadora.somaArray(numeros);
        Calculadora.somaVarArgs(1,2,3,4,5 );

    }
}
