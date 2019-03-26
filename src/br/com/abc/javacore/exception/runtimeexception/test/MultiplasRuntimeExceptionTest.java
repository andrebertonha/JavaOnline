package br.com.abc.javacore.exception.runtimeexception.test;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {
    public static void main(String[] args) {
        //unckecked e checked exception
        //superclasse nao pode vir antes senao a superclasse capitura todas as execoes ,subclasses serao unreacheble
        //mais generico por ultimo
        try {
            throw new IndexOutOfBoundsException();
        } catch (IllegalArgumentException | IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("dentro do array index out of bounds");
        }
        System.out.println("final do programa");

        try{
            talvezLanceException();
        }catch (Exception e) {

        }
        //IOException superclasse do FileNotFoundException pode ser usado tb


    }

    private static void talvezLanceException() throws SQLException, AWTException,IOException {

    }
}
