package Exercicios.Exercicio3.dominio;

import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private String cargo;
    private Departamento departamento;
    private ArrayList<Projeto> projetos = new ArrayList<>();

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }
    public Funcionario(String nome, String cargo, Departamento departamento, ArrayList<Projeto> projetos) {
        this.nome = nome;
        this.cargo = cargo;
        this.departamento = departamento;
        this.projetos = (projetos != null) ? projetos : new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(ArrayList<Projeto> projetos) {
        this.projetos = projetos;
    }
}
