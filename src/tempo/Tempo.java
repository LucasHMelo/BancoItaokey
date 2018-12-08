
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempo;

import java.sql.PreparedStatement;
import java.time.LocalDate;
import Conexao.ConnectionFactory;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Lucas
 */

public class Tempo {
    private final Connection conexao;
    private static LocalDate temp= LocalDate.of(2017,07,1);
    
    public Tempo(Connection conexao) {
        this.conexao = conexao;
        PegarData();
    }

    

    public static LocalDate getTemp()
    {
        
        return temp;
    }

    public static void setTemp(LocalDate temp)
    {
        Tempo.temp = temp;
    }

    
    public LocalDate pegaDia(){
        return (Tempo.temp);
    }


    
    public void mais(int dias)
    {
        for(int i=0; i<dias; i++)
        {
            temp = temp.plusDays(1);
            //manutencao();
            //juros();
            EnviarData();
        }
    }
    
    public BigDecimal mes()
    {
        BigDecimal selic = new BigDecimal("0.0");
        switch (temp.getMonthValue())
        {
            case (1):
                selic = new BigDecimal("0.7").multiply(new BigDecimal("0.58").multiply(new BigDecimal("0.01")));
                selic = selic.add(new BigDecimal("1.0"));
                //selic = 0.7*0.58/100;
                break;
            case (2):
                selic = new BigDecimal("0.7").multiply(new BigDecimal("0.47").multiply(new BigDecimal("0.01")));
                selic = selic.add(new BigDecimal("1.0"));
                //selic = 0.7*0.47/100;
                break;
            case (3):
                selic = new BigDecimal("0.7").multiply(new BigDecimal("0.53").multiply(new BigDecimal("0.01")));
                selic = selic.add(new BigDecimal("1.0"));
                //selic = 0.7*0.53/100;
                break;
            case (4):
                selic = new BigDecimal("0.7").multiply(new BigDecimal("0.52").multiply(new BigDecimal("0.01")));
                selic = selic.add(new BigDecimal("1.0"));
                //selic = 0.7*0.52/100;
                break;
            case (5):
                selic = new BigDecimal("0.7").multiply(new BigDecimal("0.52").multiply(new BigDecimal("0.01")));
                selic = selic.add(new BigDecimal("1.0"));
                //selic = 0.7*0.52/100;
                break;
            case (6):
                selic = new BigDecimal("0.7").multiply(new BigDecimal("0.52").multiply(new BigDecimal("0.01")));
                selic = selic.add(new BigDecimal("1.0"));
                //selic = 0.7*0.52/100;
                break;
            case (7):
                selic = new BigDecimal("1.005");
                //selic = 0.005;
                break;
            case (8):
                selic = new BigDecimal("1.005");
               //selic = 0.005;
                break;
            case (9):
                selic = new BigDecimal("0.7").multiply(new BigDecimal("0.64").multiply(new BigDecimal("0.01")));
                selic = selic.add(new BigDecimal("1.0"));
                //selic = 0.7*0.64/100;
                break;
            case (10):
                selic = new BigDecimal("0.7").multiply(new BigDecimal("0.64").multiply(new BigDecimal("0.01")));
                selic = selic.add(new BigDecimal("1.0"));
                //selic = 0.7*0.64/100;
                break;
            case (11):
                selic = new BigDecimal("0.7").multiply(new BigDecimal("0.57").multiply(new BigDecimal("0.01")));
                selic = selic.add(new BigDecimal("1.0"));
                //selic = 0.7*0.57/100;
                break;
            case (12):
                selic = new BigDecimal("0.7").multiply(new BigDecimal("0.58").multiply(new BigDecimal("0.01")));
                selic = selic.add(new BigDecimal("1.0"));
                //selic = 0.7*0.58/100;
                break;

        }

        return (selic);
    }
/*
    public void manutencao() //PODE ERRAR AQUI
    {
        if (this.temp.getDayOfMonth() == 15)
        {
             String sql = "update CC "
                 +"set saldo = saldo- ? ";
            try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            
                pstmt.setDouble(1,20);
                pstmt.execute();
                pstmt.close();
                conexao.close();

            }catch (SQLException ex) {
            System.out.println("Erro no acesso ao banco de dados.");
            while (ex != null) {
                System.out.println("SQL State: " + ex.getSQLState());
                System.out.println("Mensagem: " + ex.getMessage());
                System.out.println("Error Code: " + ex.getErrorCode());
                ex = ex.getNextException();
                }
            }
        }
    }
        */
    public void limpa()
    {
         String sql = "truncate" + " tempo ";
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
          pstmt.execute();
          pstmt.close();
          conexao.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(Tempo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void EnviarData()
    {

          String sql = "update tempo set data = (?)";
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setDate(1,java.sql.Date.valueOf(getTemp()));
            pstmt.execute();
            pstmt.close();
            conexao.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(Tempo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void PegarData()
    {
        String sql = "select * from tempo";
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            rs.next();
                String data = rs.getString("data");
                this.temp = LocalDate.parse(data);
            
        } catch (SQLException ex)
        {
            Logger.getLogger(Tempo.class.getName()).log(Level.SEVERE, null, ex);
        }     
        
    }/*
    public void Retornadado(double saldo)
    {
         String sql = "update Mov set valor = ?";
         try (PreparedStatement pstmt2 = conexao.prepareStatement(sql)) {
            pstmt2.setDouble(1, saldo);
            pstmt2.execute();
            pstmt2.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(Tempo.class.getName()).log(Level.SEVERE, null, ex);
        }
                     
        
    }

    public void juros()
    {
        String sql = "select * from Mov";
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next())
            {
                String data = rs.getString("datamento");

                LocalDate date = LocalDate.parse(data);
                long dif = ChronoUnit.DAYS.between(temp, date);
                if (dif % 30 == 0)//Diferenca das datas for multiplo de 30
                {
                    BigDecimal juro = mes();
                    BigDecimal s2 = new BigDecimal("0.0");
                    double saldo = rs.getDouble("valor");
                    s2 = new BigDecimal(""+saldo);
                    s2 = s2.multiply(juro);
                    saldo = Double.parseDouble(""+s2);
                    Retornadado(saldo);
                    //JUROS
                }
            }
            pstmt.close();
            conexao.close();
            

        } catch (SQLException ex)
        {
            Logger.getLogger(Tempo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
*/
}
