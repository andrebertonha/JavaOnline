package br.com.abc.javacore.exception.error.test;

public class ErrorTest {
    public static void main(String[] args) {
        stackOverflowError();
    }

    //checked alem do dominio do programador
    //unchecked problema de logica, o desenvolvedor tem o controle e criou o cod errado -> provavelmente runtimeexception

    public static void stackOverflowError(){
        stackOverflowError();
    }
}
