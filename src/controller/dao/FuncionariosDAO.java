package controller.dao;

import controller.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Funcionarios;

public class FuncionariosDAO {
    
    
    private Connection con;
    private PreparedStatement cmd;
    
    public FuncionariosDAO(){
        con = Conexao.conectar();
    }
    
    
    public int inserir(Funcionarios fuc){
        
        try {
            String SQL = "insert into funcionarios (nomeFunc,salario,cargo) values (?,?,?)";
            cmd = con.prepareStatement(SQL,Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1,fuc.getNomeFunc());
            cmd.setDouble(2,fuc.getSalario());
            cmd.setString(3,fuc.getCargo());
            
            if(cmd.executeUpdate() > 0){
                ResultSet rs = cmd.getGeneratedKeys();
                return rs.next() ? rs.getInt(1) : -1;
                
            }else{
                return -1;
            }
            
            
        } catch (Exception ero) {
            System.out.println("Erro" + ero.getMessage());
         return -1;
            
        }finally{
            Conexao.desconectar(con);
        }
    }
    
public int atualizar(Funcionarios fuc){
    try {
        String SQL = "update funcionarios set nomeFunc=?, salario=?, cargo=? where id = ?";
        cmd = con.prepareStatement(SQL);
        cmd.setString(1,fuc.getNomeFunc());
        cmd.setDouble(2,fuc.getSalario());
        cmd.setString(3,fuc.getCargo());
        cmd.setInt(4,fuc.getId());
        
           if (cmd.executeUpdate() > 0) {
                return fuc.getId();
            } else {
                return -1;
            }
    } catch (Exception ero) {
        System.out.println("ERRO: " + ero.getMessage());
            return -1;
  
    }finally{
        Conexao.desconectar(con);
    }
}  
    
  private List<Funcionarios> pesquisar(PreparedStatement cmd){
      try {
          
          
      ResultSet rs = cmd.executeQuery();
      List<Funcionarios> lista = new ArrayList<>();
      while(rs.next()){
          Funcionarios funcionarios = new Funcionarios(
                  rs.getInt("id"),
                  rs.getString("nomeFunc"),
                  rs.getDouble("salario"),
                  rs.getString("cargo")
          
          
          
          );
          lista.add(funcionarios);  
      }
      return lista;
      } catch (Exception ero) {
              System.out.println("ERRO: " + ero.getMessage());
            return null;
              
         }finally{
          Conexao.desconectar(con);
      }
  }

public List<Funcionarios> pesquisarPorId(String id){
    try {
        String SQL = "select * from funcionarios where id = ?";
        cmd = con.prepareStatement(SQL);
        cmd.setInt(1,Integer.parseInt(id));
        return pesquisar(cmd);  
    } catch (Exception ero) {
         System.out.println("ERRO: " + ero.getMessage());
            return null;
    }

}
  
public List<Funcionarios> pesquisarPorNome(String nomeFunc){
    try {
        String SQL = "select * from funcionarios where upper (nomeFunc) like ?";
        cmd = con.prepareStatement(SQL);
        cmd.setString(1,"%" + nomeFunc.toUpperCase() + "%");
        ResultSet rs = cmd.executeQuery();
        List<Funcionarios> lista = new ArrayList<>();
        while(rs.next()){
           Funcionarios funcionarios = new Funcionarios(
                   rs.getInt("id"),
                   rs.getString("nomeFunc"),
                   rs.getDouble("salario"),
                   rs.getString("cargo")     
           );
            lista.add(funcionarios);
        }    
        return lista;
   
    } catch (Exception ero) {
                  System.out.println("ERRO: " + ero.getMessage());
            return null; 
    }finally{
         Conexao.desconectar(con);
    }
}  


public List<Funcionarios> listar(){
    
    try {
        String SQL = "select * from funcionarios order by id";
         cmd = con.prepareStatement(SQL);
          return pesquisar(cmd);
    } catch (Exception ero) {
         System.out.println("ERRO: " + ero.getMessage());
            return null;
    }
    
}
    
       public List<Funcionarios> listarDesc(){
        try {
            String SQL = "select * from funcionarios order by id desc";
            cmd = con.prepareStatement(SQL);
            return pesquisar(cmd);
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
        
        
    }
    
    
    public List<Funcionarios> listarDescNome(){
        try {
            String SQL = "select * from funcionarios order by nomeFunc desc";
            cmd = con.prepareStatement(SQL);
            return pesquisar(cmd);
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
        
        
    }
    
    public List<Funcionarios> listarNomeAsc(){
        try {
            String SQL = "select * from funcionarios order by nomeFunc asc";
            cmd = con.prepareStatement(SQL);
            return pesquisar(cmd);
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
        
        
    }
    
    
    
  
    
}
