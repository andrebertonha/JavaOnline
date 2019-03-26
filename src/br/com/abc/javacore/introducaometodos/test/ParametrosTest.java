package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class ParametrosTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 5;
        int num2 = 10;
        //quando se passa tipos primitivos como parametro para o metodo são passados apenas os valores
        calc.alteraDoisNumeros(num1,num2);
        System.out.println("dentro do teste ");
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
    }
}
