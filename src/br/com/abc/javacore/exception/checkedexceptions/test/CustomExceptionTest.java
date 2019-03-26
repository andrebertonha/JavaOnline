package br.com.abc.javacore.exception.checkedexceptions.test;

import br.com.abc.javacore.exception.customexception.LoginInvalidoException;

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    public static void logar() throws LoginInvalidoException {

        String usuarioBancoDeDados = "123";
        String senhaBancoDeDados = "111";
        String usuarioDigitado = "goku";
        String senhaDigitada = "123";
        if(!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitada)){
            throw new LoginInvalidoException();
        }else {
            System.out.println("Logado");
        }

    }
}
