package br.com.abc.javacore.polimorfismo.test;

import br.com.abc.javacore.polimorfismo.classes.ArquivoDAOImpl;
import br.com.abc.javacore.polimorfismo.classes.DatabaseDAOImpl;
import br.com.abc.javacore.polimorfismo.classes.GenericDAO;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DAOTest {
    public static void main(String[] args) {
        //trocar o objeto
        GenericDAO arquivoDAO = new ArquivoDAOImpl();
        arquivoDAO.save();

    }
}
