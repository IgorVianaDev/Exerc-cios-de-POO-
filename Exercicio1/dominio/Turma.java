package Exercicios.Exercicio1.dominio;

import java.util.ArrayList;

public class Turma {
    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Turma(String nome) {
        this.nome = nome;
    }

    public Turma(String nome, ArrayList<Aluno> alunos){
        this.nome = nome;
        this.alunos = (alunos != null) ? alunos : new ArrayList<>();
    }

    public Turma(String nome, Professor professor, ArrayList<Aluno> alunos) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}
