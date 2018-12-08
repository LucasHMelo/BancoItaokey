/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Conexao.ConnectionFactory;
import java.sql.Connection;
/**
 *
 * @author Lucas
 */
public class AdminDAO {
    private final Connection conexao;

    public AdminDAO(Connection conexao) {
        this.conexao = conexao;
    }
    public boolean checkLogin(String cpf, String senha) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = this.conexao.prepareStatement("SELECT * FROM admin WHERE cpf = ? and senha = ?");
            stmt.setString(1, cpf);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {

                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //this.conexao.closeConnection(this.conexao, stmt, rs);
        }

        return check;

    }
}
