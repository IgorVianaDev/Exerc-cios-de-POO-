package Exercicios.Exercicio1.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private Turma turmaMatriculada;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }
    public Aluno(String nome, int idade, Turma turmaMatriculada){
        this.nome = nome;
        this.idade = idade;
        this.turmaMatriculada = turmaMatriculada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Turma getTurmaMatriculada() {
        return turmaMatriculada;
    }

    public void setTurmaMatriculada(Turma turmaMatriculada) {
        this.turmaMatriculada = turmaMatriculada;
    }
}
