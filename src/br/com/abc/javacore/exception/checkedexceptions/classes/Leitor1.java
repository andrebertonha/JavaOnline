package br.com.abc.javacore.exception.checkedexceptions.classes;

public class Leitor1 implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("fechando leitor 1");
    }
}
