package br.com.abc.javacore.jdbc.db;

import br.com.abc.javacore.jdbc.classes.Comprador;
import br.com.abc.javacore.jdbc.classes.MyRowSetListener;
import br.com.abc.javacore.jdbc.conn.ConexaoFactory;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompradorDB {
    public static void save(Comprador comprador) {
        String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('" + comprador.getCpf() + "', '" + comprador.getNome() + "')";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro inserido com sucesso");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void saveTransaction() throws SQLException {
        String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('TESTE1', 'TESTE1')";
        String sql2 = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('TESTE2', 'TESTE2')";
        String sql3 = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('TESTE3', 'TESTE3')";
        Connection conn = ConexaoFactory.getConexao();
        Savepoint savepoint = null;
        try {
            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            savepoint = conn.setSavepoint("one");
            stmt.executeUpdate(sql2);
            if (true)
                throw new SQLException();
            stmt.executeUpdate(sql3);
            conn.commit();
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro inserido com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback(savepoint);
            conn.commit();
        }
    }

    public static void delete(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Nao foi possivel excluir o registro");
            return;
        }

        String sql = "DELETE FROM `agencia`.`comprador` WHERE (`id` = '" + comprador.getId() + "')";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro excluido com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Nao foi possivel atualizar o registro");
            return;
        }
        String sql = "UPDATE `agencia`.`comprador` SET `cpf` = '" + comprador.getCpf() + "', `nome` = '" + comprador.getNome() + "' WHERE (`id` = '" + comprador.getId() + "')";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro alterado com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //ganho de memoria PREPAREDSTATEMENT
    public static void updatePreparedStatement(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Nao foi possivel atualizar o registro");
            return;
        }
        String sql = "UPDATE `agencia`.`comprador` SET `cpf` = ?, `nome` = ? WHERE (`id` = ?)";
        Connection conn = ConexaoFactory.getConexao();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,comprador.getCpf());
            ps.setString(2,comprador.getNome());
            ps.setInt(3,comprador.getId());
            ps.executeUpdate();
            ConexaoFactory.close(conn, ps);
            System.out.println("Registro alterado com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateRowSet(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Nao foi possivel atualizar o registro");
            return;
        }
        String sql = "UPDATE `agencia`.`comprador` SET `cpf` = ?, `nome` = ? WHERE (`id` = ?)";
        JdbcRowSet jrs = ConexaoFactory.getRowSetConnection();
        jrs.addRowSetListener(new MyRowSetListener());
        try {
            jrs.setCommand(sql);
            jrs.setString(1,comprador.getCpf());
            jrs.setString(2,comprador.getNome());
            jrs.setInt(3,comprador.getId());
            jrs.execute();
            ConexaoFactory.close(jrs);
            System.out.println("Registro alterado com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateRowSetCached(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Nao foi possivel atualizar o registro");
            return;
        }
        String sql = "SELECT * FROM comprador where id = ?";
        CachedRowSet crs = ConexaoFactory.getRowSetConnectionCached();
        try {
            crs.setCommand(sql);
            crs.setInt(1,comprador.getId());
            crs.execute();
            crs.next();
            crs.updateString("nome","testeste");
            crs.updateRow();

            crs.acceptChanges();
            System.out.println("Registro alterado com sucesso");
        } catch (SQLException  e) {
            e.printStackTrace();
        }
    }

    public static List<Comprador> selectAll() {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }
            ConexaoFactory.close(conn, stmt, rs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Comprador> searchByName(String nome) {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador where nome like '%" + nome + "%'";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }
            ConexaoFactory.close(conn, stmt, rs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }



    public static List<Comprador> searchByNamePreparedStatement(String nome) {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador where nome like ?";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,"%"+nome+"%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }
            ConexaoFactory.close(conn, ps, rs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Comprador> searchByNameRowSet(String nome) {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador where nome like ?";
        JdbcRowSet jrs = ConexaoFactory.getRowSetConnection();
        jrs.addRowSetListener(new MyRowSetListener());
        List<Comprador> compradorList = new ArrayList<>();
        try {
            jrs.setCommand(sql);
            jrs.setString(1,"%"+nome+"%");
            jrs.execute();
            while (jrs.next()) {
                compradorList.add(new Comprador(jrs.getInt("id"), jrs.getString("cpf"), jrs.getString("nome")));
            }
            ConexaoFactory.close(jrs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Comprador> searchByNameCallableStatement(String nome) {
        String sql = "CALL `agencia`.`SP_GetCompradoresPorNome`(?)";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1,"%"+nome+"%");
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }
            ConexaoFactory.close(conn, cs, rs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void selectMetaData() {
        String sql = "SELECT * from agencia.comprador";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            rs.next();
            int qtdeColunas = rsmd.getColumnCount();
            System.out.println("Quantidade de colunas: " + qtdeColunas);
            for (int i = 1; i <= qtdeColunas; i++) {
                System.out.println("tabela: " + rsmd.getTableName(i));
                System.out.println("nome coluna " + rsmd.getColumnName(i));
                System.out.println("tamanho colunas " + rsmd.getColumnDisplaySize(i));
            }

            ConexaoFactory.close(conn, stmt, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void checkDriverStatus() {
        Connection conn = ConexaoFactory.getConexao();
        try{
            //resultset começa antes de primeira linha, necessario rs.next() para ir para o primeiro registro
            //somente para frente
            DatabaseMetaData dbmd = conn.getMetaData();
            if(dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)){
                System.out.println("Suporta TYPE_FORWARD_ONLY");
                if(dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)){
                    System.out.println("e tambem suporta CONCUR_UPDATABLE");
                }
            }
            //pode ir pra frente pra tras ou p qualquer registro
            if(dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)){
                System.out.println("Suporta TYPE_SCROLL_INSENSITIVE");
                if(dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    System.out.println("e tambem suporta CONCUR_UPDATABLE");
                }
            }
            //resultset alterado automaticamente enquanto se modifica o banco e nem todos os bancos suportam
            if(dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)){
                System.out.println("Suporta TYPE_SCROLL_SENSITIVE");
                if(dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    System.out.println("e tambem suporta CONCUR_UPDATABLE");
                }
            }
            ConexaoFactory.close(conn);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void testTypeScroll() {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador";
        Connection conn = ConexaoFactory.getConexao();

        try {
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); //mysql considera como TYPE_SCROLL_INSENSITIVE mesmo q voce nao especifique
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.last()) {
                System.out.println("Ultima Linha: "+new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
                System.out.println("numero ultima linha: "+rs.getRow());
            }
            System.out.println("retornou para primeira linha: "+rs.first());
            System.out.println("primeira linha: "+rs.getRow());
            rs.absolute(4);
            System.out.println(" Linha 4 : "+new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            //baseado na linha q esta
            rs.relative(-1);
            System.out.println(" Linha 3 : "+new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            System.out.println(rs.isLast());
            System.out.println(rs.isFirst());
            rs.afterLast();
            System.out.println("----------------");
            while(rs.previous()){
                System.out.println(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));

            }

            ConexaoFactory.close(conn, stmt, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateNomesToLowerCase(){
        String sql = "SELECT id, nome, cpf FROM agencia.comprador";
        Connection conn = ConexaoFactory.getConexao();

        try {
            DatabaseMetaData dbmd = conn.getMetaData();
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println(dbmd.updatesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            System.out.println(dbmd.insertsAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            System.out.println(dbmd.deletesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));

            if (rs.next()) {
                rs.updateString("nome", rs.getString("nome").toUpperCase());
                rs.updateRow(); //quando é feita a atualizacao no banco NAO EH FEITA NO RESULT SET

//                if(rs.rowUpdated()){
//                    System.out.println("linha atualizada");
//                }
            }
            rs.absolute(2);
            String nome = rs.getString("nome");
            rs.moveToInsertRow();
            rs.updateString("nome", nome.toUpperCase());
            rs.updateString("cpf", "999.999.999-99");
            rs.insertRow();
            rs.moveToCurrentRow();
            System.out.println(rs.getString("nome") +" row "+rs.getRow());

            rs.absolute(7);
            rs.deleteRow();



            ConexaoFactory.close(conn, stmt, rs);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
