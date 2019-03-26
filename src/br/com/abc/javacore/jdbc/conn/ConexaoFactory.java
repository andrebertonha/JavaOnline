package br.com.abc.javacore.jdbc.conn;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

import java.sql.*;

public class ConexaoFactory {
    //java.sql = Connection, Statement, ResultSet
    //DriverManager

    public static Connection getConexao() {
        String url = "jdbc:mysql://localhost:3306/agencia?useSSL=true";
        String user = "root";
        String password = "root";

        try {
            //anterior jdbc 3< teria que usar:
            //Class.forName("com.mysql.jdbc.Driver");
            //Connection connection = DriverManager.getConnection(url,user,password);
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static JdbcRowSet getRowSetConnection() {
        String url = "jdbc:mysql://localhost:3306/agencia?useSSL=true";
//        String url = "jdbc:mysql://localhost:3306/agencia";
        String user = "root";
        String password = "root";
        try {
            JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
            jdbcRowSet.setUrl(url);
            jdbcRowSet.setUsername(user);
            jdbcRowSet.setPassword(password);
            return jdbcRowSet;
        } catch (SQLException  e) {
            e.printStackTrace();
        }
        return null;
    }

    public static CachedRowSet getRowSetConnectionCached() {
        String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false&useTimezone=true&serverTimezone=UTC&relaxAutoCommit=true";
        String user = "root";
        String password = "root";
        try {
            CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
            crs.setUrl(url);
            crs.setUsername(user);
            crs.setPassword(password);
            return crs;
        } catch (SQLException  e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(JdbcRowSet jrs) {
        try {
            if (jrs != null)
                jrs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection connection) {
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection connection, Statement stmt){
        close(connection);
        try {
            if (stmt != null)
                stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection connection, Statement stmt, ResultSet rs){
        close(connection, stmt);
        try {
            if (rs != null)
                rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
