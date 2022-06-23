/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pesquisa;

/**
 *
 * @author GIOVANE
 */
import java.sql.*;
import javax.swing.*;

public class Conexao {

    private  String url = "jdbc:mysql://localhost:3306/testes";
    private String username = "root";
    private String password = "";
    Connection conexao = null;
    Connection con = conexao;
    Statement st = null;
    ResultSet resultset = null;

    public void conectar (){  
    try{
        conexao = DriverManager.getConnection(url, username, password);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Falha");
    }
    }


    public void desconectar (){  
    try{
       conexao.close();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Falha");
    }
}

    public void executaSQL(String sql) {
        try {
            st = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            st = conexao.createStatement();
            resultset = st.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Nao foi possível executar o comando sql"
                    + "" + e + "O comando passado foi" + sql);
        }
    }
}
