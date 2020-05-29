package model;

public class Vendas {
    
    
    private int id;
    private String modeloVei;
    private int quantidade;
    private double preco;
    private String cliente;

    public Vendas() {
    }

    public Vendas(int id, String modeloVei, int quantidade, double preco, String cliente) {
        this.id = id;
        this.modeloVei = modeloVei;
        this.quantidade = quantidade;
        this.preco = preco;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModeloVei() {
        return modeloVei;
    }

    public void setModeloVei(String modeloVei) {
        this.modeloVei = modeloVei;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Vendas{" + "id=" + id + ", modeloVei=" + modeloVei + ", quantidade=" + quantidade + ", preco=" + preco + ", cliente=" + cliente + '}';
    }

    
    
    
}
