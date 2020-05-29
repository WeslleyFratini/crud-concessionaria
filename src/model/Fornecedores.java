package model;

public class Fornecedores {
  
    private int id;
    private String nome_forn;
    private String cnpj;

    public Fornecedores() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_forn() {
        return nome_forn;
    }

    public void setNome_forn(String nome_forn) {
        this.nome_forn = nome_forn;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Fornecedores(int id, String nome_forn, String cnpj) {
        this.id = id;
        this.nome_forn = nome_forn;
        this.cnpj = cnpj;
    }

   
    @Override
    public String toString() {
        return nome_forn;
    }
    
    
    
    
}
