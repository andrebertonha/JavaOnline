package br.com.abc.javacore.jdbc.interfaces;

import br.com.abc.javacore.jdbc.classes.Carro;

import java.util.List;

public interface CarroDAO {


    void delete(Carro carro);

    void save(Carro carro);

    void update(Carro carro);

    List<Carro> selectAll();

    List<Carro> searchByName(String nome);
}
