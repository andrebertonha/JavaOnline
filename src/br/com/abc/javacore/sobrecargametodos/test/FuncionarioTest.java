package br.com.abc.javacore.sobrecargametodos.test;

import br.com.abc.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Chica da Silva","111.222.333.44", 4500, "45.555.666-9");
        Funcionario funcionario2 = new Funcionario();

        funcionario.imprime();
        funcionario2.imprime();
    }
}
