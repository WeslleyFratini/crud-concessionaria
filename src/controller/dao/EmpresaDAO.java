package controller.dao;

import controller.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Empresa;

public class EmpresaDAO {
    
    private Connection con;
    private PreparedStatement cmd;
    
    public EmpresaDAO(){
        con = Conexao.conectar();
    }
    
    
 public int inserir(Empresa emp){
     try {
         String SQL = "insert into empresa (nomeEmpre,rua,cep,numero,cidade,uf) values (?,?,?,?,?,?)";
         
         cmd = con.prepareStatement(SQL,Statement.RETURN_GENERATED_KEYS);
         cmd.setString(1,emp.getNomeEmpre());
         cmd.setString(2,emp.getRua());
         cmd.setInt(3,emp.getCep());
         cmd.setInt(4,emp.getNumero());
         cmd.setString(5,emp.getCidade());
         cmd.setString(6,emp.getUf());
         
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
public int atualizar(Empresa emp){
    try {
        String SQL = "update empresa set nomeEmpre=?,rua=?,cep=?,numero=?,uf=?,cidade=? where id =?";
        
         cmd = con.prepareStatement(SQL);
         cmd.setString(1,emp.getNomeEmpre());
         cmd.setString(2,emp.getRua());
         cmd.setInt(3,emp.getCep());
         cmd.setInt(4,emp.getNumero());
         cmd.setString(5,emp.getUf());
         cmd.setString(6,emp.getCidade());
         cmd.setInt(7, emp.getId());
         
            if (cmd.executeUpdate() > 0) {
                return emp.getId();
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
     
     
private List<Empresa> pesquisar(PreparedStatement cmd){
    try {
         
    ResultSet rs = cmd.executeQuery();
    List<Empresa> lista = new ArrayList<>();
    while(rs.next()){
        
        Empresa empresa = new Empresa(
                rs.getInt("id"),
                rs.getString("nomeEmpre"),
                rs.getString("rua"),
                rs.getInt("cep"),
                rs.getInt("numero"),
                rs.getString("cidade"),
                rs.getString("uf")
 
        );
        lista.add(empresa);
        
        
    }
    return lista;
    } catch (Exception erro) {
        System.out.println("ERRO: " + erro.getMessage());
            return null;
    }finally{
          Conexao.desconectar(con);
    }
}     
     
 public List<Empresa> pesquisarPorId(String id){
     try {
         String SQL = "select * from empresa where id = ?";
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, Integer.parseInt(id));
            return pesquisar(cmd);

     } catch (Exception erro) {
         System.out.println("ERRO: " + erro.getMessage());
            return null;
         
     }
     
     
 }    
    
 
 public List<Empresa> pesquisarPorNome(String nomeEmpre){
     try {
         String SQL =  "select * from empresa where upper(nomeEmpre) like ?  ";
         cmd = con.prepareStatement(SQL);
         cmd.setString(1,"%" + nomeEmpre.toUpperCase()+ "%");
         
         ResultSet rs = cmd.executeQuery();
         List<Empresa> lista = new ArrayList<>();
         while (rs.next()) {
             Empresa empresa = new Empresa(
                rs.getInt("id"),
                rs.getString("nomeEmpre"),
                rs.getString("rua"),
                rs.getInt("cep"),
                rs.getInt("numero"),
                rs.getString("cidade"),
                rs.getString("uf")
        );
        lista.add(empresa);     
         }        
         return lista;
     } catch (Exception erro) {
          System.out.println("ERRO: " + erro.getMessage());
            return null;
     }finally{
          Conexao.desconectar(con);
     }
 }
    
    
    public List<Empresa> listar(){
        try {
            String SQL = "select * from empresa order by id";
            cmd = con.prepareStatement(SQL);
            return pesquisar(cmd);
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
        
        
    }
    
    
    
       public List<Empresa> listarDesc(){
        try {
            String SQL = "select * from empresa order by id desc";
            cmd = con.prepareStatement(SQL);
            return pesquisar(cmd);
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
        
        
    }
    
    
    public List<Empresa> listarDescNome(){
        try {
            String SQL = "select * from empresa order by nomeEmpre desc";
            cmd = con.prepareStatement(SQL);
            return pesquisar(cmd);
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
        
        
    }
    
    public List<Empresa> listarNomeAsc(){
        try {
            String SQL = "select * from empresa order by nomeEmpre asc";
            cmd = con.prepareStatement(SQL);
            return pesquisar(cmd);
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
        
        
    }
    
}
