package br.com.abc.javacore.exception.customexception;

public class LoginInvalidoException extends Exception {

    //excecao customizada nao coloque nunca metodos nem nada pra tratar aqui.
    //classes de excecao nao deve tratar nenhum tipo de exceCao
    public LoginInvalidoException(){
        super("Usuario ou senha invalidos");
    }

}
