package controller.dao;

import controller.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Fornecedores;

public class FornecedoresDAO {
    
    private Connection con;
    private PreparedStatement cmd;
    
    public FornecedoresDAO(){
        con = Conexao.conectar();
    }
    
    
 public int inserir(Fornecedores forn){
     try {
         String SQL = "insert into fornecedores (nome_forn, cnpj) values (?,?)";
         
         cmd = con.prepareStatement(SQL,Statement.RETURN_GENERATED_KEYS);
        
         cmd.setString(1,forn.getNome_forn());
         cmd.setString(2,forn.getCnpj());
         
         
         if(cmd.executeUpdate() > 0){
             ResultSet rs = cmd.getGeneratedKeys();
             return rs.next() ? rs.getInt(1) : -1;
         }else{
             return -1;
         }
         
         
     } catch (Exception erro) {
         System.out.println("Erro" + erro.getMessage());
         return -1;
    
     }finally{
         Conexao.desconectar(con);
     }
     
     
 }    
public int atualizar(Fornecedores forn){
    try {
        String SQL = "update fornecedores set nome_forn=?,cnpj=? where id =?";
        cmd = con.prepareStatement(SQL);
        cmd.setString(1,forn.getNome_forn());
         cmd.setString(2,forn.getCnpj());
         cmd.setInt(3,forn.getId());
                  
            if (cmd.executeUpdate() > 0) {
                return forn.getId();
            } else {
                return -1;
            }
         
    } catch (Exception erro) {
        System.out.println("ERRO: " + erro.getMessage());
            return -1;
    }finally{
          Conexao.desconectar(con);
    }
}
     
     
private List<Fornecedores> pesquisar(PreparedStatement cmd){
    try {
         
    ResultSet rs = cmd.executeQuery();
    List<Fornecedores> lista = new ArrayList<>();
    while(rs.next()){
        
        Fornecedores fornecedores = new Fornecedores(
                rs.getInt("id"),
                rs.getString("nome_forn"),
                rs.getString("cnpj")
                
        );
        lista.add(fornecedores);
        
        
    }
    return lista;
    } catch (Exception erro) {
        System.out.println("ERRO: " + erro.getMessage());
            return null;
    }finally{
          Conexao.desconectar(con);
    }
}     
     
 public List<Fornecedores> pesquisarPorId(String id){
     try {
         String SQL = "select * from fornecedores where id = ?";
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, Integer.parseInt(id));
            return pesquisar(cmd);

     } catch (Exception erro) {
         System.out.println("ERRO: " + erro.getMessage());
            return null;
         
     }
     
     
 }    
    
 
 public List<Fornecedores> pesquisarPorNome(String nome_forn){
     try {
         String SQL =  "select * from fornecedores where upper(nome_forn) like ?  ";
         cmd = con.prepareStatement(SQL);
         cmd.setString(1,"%" + nome_forn.toUpperCase()+ "%");
         
         ResultSet rs = cmd.executeQuery();
         List<Fornecedores> lista = new ArrayList<>();
         while (rs.next()) {
             Fornecedores fornecedores = new Fornecedores(
                rs.getInt("id"),
                rs.getString("nome_forn"),
                rs.getString("cnpj")
        );
             
        lista.add(fornecedores);
        
         }        
         return lista;
     } catch (Exception erro) {
          System.out.println("ERRO: " + erro.getMessage());
            return null;
     }finally{
          Conexao.desconectar(con);
     }
 }
    
    
    public List<Fornecedores> listar(){
        try {
            String SQL = "select * from fornecedores order by id ";
            cmd = con.prepareStatement(SQL);
            return pesquisar(cmd);
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
        
        
    }
    
        
       public List<Fornecedores> listarDesc(){
        try {
            String SQL = "select * from fornecedores order by id desc";
            cmd = con.prepareStatement(SQL);
            return pesquisar(cmd);
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
        
        
    }
    
    
    public List<Fornecedores> listarDescNome(){
        try {
            String SQL = "select * from fornecedores order by nome_forn desc";
            cmd = con.prepareStatement(SQL);
            return pesquisar(cmd);
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
        
        
    }
    
    public List<Fornecedores> listarNomeAsc(){
        try {
            String SQL = "select * from fornecedores order by nome_forn asc";
            cmd = con.prepareStatement(SQL);
            return pesquisar(cmd);
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
        
        
    }
    
    
    
    
    
    
    
}
