package controller.dao;

import controller.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Vendas;

public class VendasDAO {

    private Connection con;
    private PreparedStatement cmd;

    public VendasDAO() {
        con = Conexao.conectar();
    }
 public int inserir(Vendas ven){
     try {
         String SQL = "insert into vendas (modeloVei,quantidade,preco,cliente) values (?,?,?,?)";
         
         cmd = con.prepareStatement(SQL,Statement.RETURN_GENERATED_KEYS);
         cmd.setString(1,ven.getModeloVei());
         cmd.setInt(2,ven.getQuantidade());
         cmd.setDouble(3,ven.getPreco());
         cmd.setString(4,ven.getCliente());

         
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
    

    public int atualizar(Vendas ven) {
        try {
            String SQL = "update vendas set modeloVei=?,quantidade=?,preco=?,cliente=? where id = ?";

            cmd = con.prepareStatement(SQL);
            cmd.setString(1, ven.getModeloVei());
            cmd.setInt(2, ven.getQuantidade());     
            cmd.setDouble(3, ven.getPreco());     
            cmd.setString(4, ven.getCliente());
            cmd.setInt(5, ven.getId());
            
            if (cmd.executeUpdate() > 0) {
                return ven.getId();
            } else {
                return -1;
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return -1;
        } finally {
            Conexao.desconectar(con);
        }
    }
private List<Vendas> pesquisar(PreparedStatement cmd){
    try {
         
    ResultSet rs = cmd.executeQuery();
    List<Vendas> lista = new ArrayList<>();
    while(rs.next()){
        
        Vendas vendas = new Vendas(
                rs.getInt("id"),
                rs.getString("modeloVei"),
                rs.getInt("quantidade"),
                rs.getDouble("preco"),
                rs.getString("cliente")
               
              
        );
        lista.add(vendas);
        
        
    }
    return lista;
    } catch (Exception erro) {
        System.out.println("ERRO: " + erro.getMessage());
            return null;
    }finally{
          Conexao.desconectar(con);
    }
}     
    public List<Vendas> pesquisarPorId(String id) {
        try {
            String SQL = "select * from vendas where id = ?";

            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, Integer.parseInt(id));

            return pesquisar(cmd);
        } catch (SQLException erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }

    public List<Vendas> pesquisarPorNome(String cliente) {
        try {
            String SQL = "select * from vendas where cliente like ?";

            cmd = con.prepareStatement(SQL);
            cmd.setString(1, "%" + cliente.toUpperCase() + "%");

            
            ResultSet rs = cmd.executeQuery();
            List<Vendas> lista = new ArrayList<>();

            while (rs.next()) {   
                Vendas ven = new Vendas(
                         rs.getInt("id"),
                        rs.getString("modeloVei"),
                        rs.getInt("quantidade"),
                        rs.getInt("preco"),
                        rs.getString("cliente")
                );
                
                lista.add(ven);
            }
            return lista;
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }

    public List<Vendas> listar() {
        try {
            String SQL = "select * from vendas order by id";
            cmd = con.prepareStatement(SQL);
            return pesquisar(cmd);
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }

        
       public List<Vendas> listarDesc(){
        try {
            String SQL = "select * from vendas order by id desc";
            cmd = con.prepareStatement(SQL);
            return pesquisar(cmd);
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
        
        
    }
    
    
    public List<Vendas> listarDescNome(){
        try {
            String SQL = "select * from vendas order by cliente desc";
            cmd = con.prepareStatement(SQL);
            return pesquisar(cmd);
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
        
        
    }
    
    public List<Vendas> listarNomeAsc(){
        try {
            String SQL = "select * from vendas order by cliente asc";
            cmd = con.prepareStatement(SQL);
            return pesquisar(cmd);
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
        
        
    }
    
    
    
    
    
    
    
    
}
