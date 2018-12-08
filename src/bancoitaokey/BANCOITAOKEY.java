/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoitaokey;

import Conexao.ConnectionFactory;
import DAO.ClienteDAO;
import java.sql.Connection;
import model.Cliente;
import telas.TelaADM;

/**
 *
 * @author Alunos
 */
public class BANCOITAOKEY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*// TODO code application logic here
        Connection conexao = ConnectionFactory.getConexao();
        ClienteDAO cDAO = new ClienteDAO(conexao);
        Cliente c = new Cliente();
        c.setNome("adksjlda");
        c.setCpf("123");
        c.setDataNasc("12126");  
        c.setSenha("aa");
        c.setIdCliente(5);
        cDAO.inserir(c);*/
        new TelaADM().setVisible(true);
    }
    
}
