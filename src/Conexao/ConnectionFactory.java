/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alunos
 */
public class ConnectionFactory {
    public static Connection getConexao() {
        String caminho = "jdbc:postgresql";
        String host = "localhost";
        String porta = "60267";
        String bd = "BancoItaokey";
        String login = "postgres";
        String senha = "123456789";
       // String url = caminho + "://" + host + ":" + porta + "/" + bd;
        String url = "jdbc:postgresql://localhost/BancoItaokey";
        Connection conexao = null;

        try {
            System.out.println("Conectando com o banco de dados.");
            Class.forName("org.postgresql.Driver");//com.mysql.jdbc.Driver
            conexao = DriverManager.getConnection(url, login, senha);
            System.out.println("Conexão com o banco de dados estabelecida.");
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o driver JDBC.");
        } catch (SQLException ex) {
            System.out.println("Erro no acesso ao banco de dados.");
            while (ex != null) {
                System.out.println("SQL State: " + ex.getSQLState());
                System.out.println("Mensagem: " + ex.getMessage());
                System.out.println("Error Code: " + ex.getErrorCode());
                ex = ex.getNextException();
            }
        }
        return conexao;
    }
    public ConnectionFactory() {
    }
    public void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
