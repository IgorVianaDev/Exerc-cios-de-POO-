package Exercicios.Exercicio3.dominio;

import java.util.ArrayList;

public class Projeto {
    private String nome;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Projeto(String nome) {
        this.nome = nome;
    }

    public Projeto(String nome, ArrayList<Funcionario> funcionarios) {
        this.nome = nome;
        this.funcionarios = (funcionarios != null) ? funcionarios : new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
