package model;

public class Empresa {
    
    private int id;
    private String nomeEmpre;
    private String rua;
    private int cep;
    private int numero;
    private String cidade;
    private String uf;
  

    public Empresa() {
    }

    public Empresa(int id, String nomeEmpre, String rua, int cep, int numero, String cidade, String uf) {
        this.id = id;
        this.nomeEmpre = nomeEmpre;
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeEmpre() {
        return nomeEmpre;
    }

    public void setNomeEmpre(String nomeEmpre) {
        this.nomeEmpre = nomeEmpre;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

  

    @Override
    public String toString() {
        return nomeEmpre;
    }
    
   

   
    
    
    
}
