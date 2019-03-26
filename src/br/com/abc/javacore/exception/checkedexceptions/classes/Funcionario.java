package br.com.abc.javacore.exception.checkedexceptions.classes;

import br.com.abc.javacore.exception.customexception.LoginInvalidoException;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {

    //pode sobrescrever com um ou mais metodos,
    // mas nao pode lancar nenhuma excecao que nao seja Runtime ou subclasse de runtime (utilizada na superclass)

    public void salvar() throws FileNotFoundException {

    }
}
