package Exercicios.Exercicio1.dominio;

import java.util.ArrayList;

public class Professor {
    private String nome;
    private String especialidade;
    private ArrayList<Turma> turmas = new ArrayList<>();

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, ArrayList<Turma> turmas) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.turmas = turmas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
}
