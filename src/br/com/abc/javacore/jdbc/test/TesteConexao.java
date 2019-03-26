package br.com.abc.javacore.jdbc.test;

import br.com.abc.javacore.jdbc.classes.Comprador;
import br.com.abc.javacore.jdbc.db.CompradorDB;

import java.sql.SQLException;
import java.util.List;

public class TesteConexao {
    public static void main(String[] args) {
//        selecionarTudo();
//        CompradorDB.selectAll();
//        List<Comprador> listaComprador = selecionarTudo();
//        List<Comprador> listaComprador2 = buscarPorNome("and");
//        System.out.println(listaComprador);
//        System.out.println(listaComprador2);
//        CompradorDB.selectMetaData();
//        CompradorDB.checkDriverStatus();
//        CompradorDB.testTypeScroll();
//        CompradorDB.updateNomesToLowerCase();

//        System.out.println(CompradorDB.searchByNamePreparedStatement("and"));
//        CompradorDB.updatePreparedStatement(new Comprador(1,"011.011.011-01","PreparedStatement"));
//        System.out.println(CompradorDB.searchByNameCallableStatement("and"));
//        System.out.println(CompradorDB.searchByNameRowSet("and"));
//        CompradorDB.updateRowSet(new Comprador(1, "011.011.011-01", "PreparedStatement"));
//            CompradorDB.updateRowSetCached(new Comprador(1, "011.011.011-01", "PreparedStatement"));
        try {
            CompradorDB.saveTransaction();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void inserir() {
        Comprador comprador = new Comprador("222.333.444-78", "Priscila");
        CompradorDB.save(comprador);
    }

    public static void deletar() {
        Comprador comprador = new Comprador();
        comprador.setId(2);
        CompradorDB.delete(comprador);
    }

    public static void atualizar() {
        Comprador comprador = new Comprador(1, "000.111.000-11", "MARIA");
        CompradorDB.update(comprador);
    }

    public static List<Comprador> selecionarTudo() {
        return CompradorDB.selectAll();
    }

    public static List<Comprador> buscarPorNome(String nome) {
        return CompradorDB.searchByName(nome);
    }
}
