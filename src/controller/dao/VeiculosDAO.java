package controller.dao;

import controller.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Veiculos;

public class VeiculosDAO {    
    
    private Connection con;
    private PreparedStatement cmd;
    
    public VeiculosDAO(){
        con = Conexao.conectar();
    }
    
    
    public int inserir(Veiculos vei){
        
        try {
            String SQL = "insert into veiculos (marca,modelo,cor,ano,preco) values (?,?,?,?,?)";
            cmd = con.prepareStatement(SQL,Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1,vei.getMarca());
            cmd.setString(2,vei.getModelo());
            cmd.setString(3,vei.getCor());
            cmd.setInt(4,vei.getAno());
            cmd.setDouble(5,vei.getPreco());
            
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
    
public int atualizar(Veiculos vei){
    try {
        String SQL = "update veiculos set marca=?,modelo=?,cor=?,ano=?,preco=?  where id = ?";
        cmd = con.prepareStatement(SQL);
        cmd.setString(1,vei.getMarca());
        cmd.setString(2,vei.getModelo());
        cmd.setString(3,vei.getCor());
        cmd.setInt(4,vei.getAno());
        cmd.setDouble(5,vei.getPreco());
        cmd.setInt(6,vei.getId());
        
        
           if (cmd.executeUpdate() > 0) {
                return vei.getId();
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
    
  private List<Veiculos> pesquisar(PreparedStatement cmd){
      try {
          
          
      ResultSet rs = cmd.executeQuery();
      List<Veiculos> lista = new ArrayList<>();
      while(rs.next()){
          Veiculos veiculos = new Veiculos(
                  rs.getInt("id"),
                  rs.getString("marca"),
                  rs.getString("modelo"),
                  rs.getString("cor"),
                  rs.getInt("ano"),
                  rs.getDouble("preco")     
          
                    );
          lista.add(veiculos);  
      }
      return lista;
      } catch (Exception ero) {
              System.out.println("ERRO: " + ero.getMessage());
            return null;
              
         }finally{
          Conexao.desconectar(con);
      }
  }

public List<Veiculos> pesquisarPorId(String id){
    try {
        String SQL = "select * from veiculos where id = ?";
        cmd = con.prepareStatement(SQL);
        cmd.setInt(1,Integer.parseInt(id));
        return pesquisar(cmd);  
    } catch (Exception ero) {
         System.out.println("ERRO: " + ero.getMessage());
            return null;
    }

}
  
public List<Veiculos> pesquisarPorNome(String marca){
    try {
        String SQL = "select * from veiculos where upper(marca) like ?";
        cmd = con.prepareStatement(SQL);
        cmd.setString(1,"%" + marca.toUpperCase() + "%");
        ResultSet rs = cmd.executeQuery();
        List<Veiculos> lista = new ArrayList<>();
        while(rs.next()){
           Veiculos veiculos = new Veiculos(
                  rs.getInt("id"),
                  rs.getString("marca"),
                  rs.getString("modelo"),
                  rs.getString("cor"),
                  rs.getInt("ano"),
                  rs.getDouble("preco")   
           );
            lista.add(veiculos);
        }    
        return lista;
   
    } catch (Exception ero) {
                  System.out.println("ERRO: " + ero.getMessage());
            return null; 
    }finally{
         Conexao.desconectar(con);
    }
}  


public List<Veiculos> listar(){
    
    try {
        String SQL = "select *from veiculos order by id";
         cmd = con.prepareStatement(SQL);
            return pesquisar(cmd);
    } catch (Exception ero) {
         System.out.println("ERRO: " + ero.getMessage());
            return null;
    }
    
}

    
       public List<Veiculos> listarDesc(){
        try {
            String SQL = "select * from veiculos order by id desc";
            cmd = con.prepareStatement(SQL);
            return pesquisar(cmd);
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
        
        
    }
    
    
    public List<Veiculos> listarDescNome(){
        try {
            String SQL = "select * from veiculos order by marca desc";
            cmd = con.prepareStatement(SQL);
            return pesquisar(cmd);
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
        
        
    }
    
    public List<Veiculos> listarNomeAsc(){
        try {
            String SQL = "select * from veiculos order by marca asc";
            cmd = con.prepareStatement(SQL);
            return pesquisar(cmd);
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
        
        
    }
    
    
    
  
    
}

