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
public void incluir(String  matricula, String nome, String email, String  idade){
    conectar();
    try{
        String instrucaoSQL = "INSERT INTO aluno(matricula,nome,email, idade)"
            + " VALUES  (' "+matricula+ " ',' " +nome+ " ', ' " +email+ " ', ' "+idade+ " ')";
        st = conexao.createStatement();
        st.executeUpdate(instrucaoSQL);
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
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "ERRO");
    }
}
public void excluir(String  matricula, String nome, String email, String  idade){
    conectar();
}
public void limpar(String  matricula, String nome, String email, String  idade){
    conectar();
}
    
}
