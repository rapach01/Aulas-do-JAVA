package formulario;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Formulario {
    static String url = "jdbc:mysql://localhost:3306/escola";
    static String user = "root";
    static String senha = "root";
    Connection conexao = null;
    Connection con = conexao;
    Statement st = null;
    ResultSet result= null;
    
public void conectar (){  
    try{
        conexao = DriverManager.getConnection(url, user, senha);
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
public String[] buscar(String matricula){
    String [] dados = new String [4];
    conectar();
    
    try{
        String instrucaoSQL = "SELECT * FROM `aluno` "
                + "WHERE `matricula` = ' " +matricula+ " ' ";
        st = conexao.createStatement();
        result = st.executeQuery(instrucaoSQL);
        
        while (result.next()){
           dados[0] = result.getString(1);
           dados[1] = result.getString(2);
           dados[2] = result.getString(3);
           dados[3] = result.getString(4);
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "ERRO");
    }
    desconectar();
    return dados;
}
public void incluir(String  matricula, String nome, String email, String  idade){
    conectar();
    try{
        String instrucaoSQL = "INSERT INTO aluno(matricula,nome,email, idade)"
            + " VALUES  (' "+matricula+ " ',' " +nome+ " ', ' " +email+ " ', ' "+idade+ " ')";
        st = conexao.createStatement();
        st.executeUpdate(instrucaoSQL);
        JOptionPane.showMessageDialog(null,"Dados Salvos Com Sucesso");
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "ERRO");
    }
    desconectar();
}
public void alterar(String  matricula, String nome, String email, String  idade){
    conectar();
    try{
        String instrucaoSQL = "UPDATE aluno SET matricula = ' "+matricula+" ', nome = ' "+nome+" ', email =' "+email+" ', idade = ' "+idade+" ' WHERE 1";
        st = conexao.createStatement();
        st.executeUpdate(instrucaoSQL);
        JOptionPane.showMessageDialog(null,"Dados Alterados Com Sucesso");

    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "ERRO");
    }
}
public void excluir(String  matricula, String nome, String email, String  idade){
    conectar();
    try{
        String instrucaoSQL = "DELETE FROM `aluno` WHERE matricula = ' "  +matricula+ " ' " ;
        st = conexao.createStatement();
        st.executeUpdate(instrucaoSQL);
        JOptionPane.showMessageDialog(null,"Dados  Excluidos Com Sucesso");

    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "ERRO");
    }
}
    
}
