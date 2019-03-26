package br.com.abc.javacore.classesabstratas.test;

import br.com.abc.javacore.classesabstratas.classes.Funcionario;
import br.com.abc.javacore.classesabstratas.classes.Gerente;
import br.com.abc.javacore.classesabstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {

        Gerente g = new Gerente("Ana", "11231-2", 2000);
        Vendedor v = new Vendedor("Camila", "123456-7", 1500, 5000);
        v.calculaSalario();
        g.calculaSalario();

        System.out.println(g);
        System.out.println("-----------------");
        System.out.println(v);
    }
}
