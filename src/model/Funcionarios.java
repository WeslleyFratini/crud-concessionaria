package model;

public class Funcionarios {
    
    private int id;
    private String nomeFunc;
    private double salario;
    private String cargo;

    public Funcionarios() {
    }

    public Funcionarios(int id, String nomeFunc, double salario, String cargo) {
        this.id = id;
        this.nomeFunc = nomeFunc;
        this.salario = salario;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return nomeFunc;
    }

    
}
