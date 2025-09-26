package Exercicios.Exercicio1.dominio;

import java.util.ArrayList;

public class Academia {
    private String nome;
    private ArrayList<Turma> turmas = new ArrayList<>();
    private ArrayList<Professor> professores = new ArrayList<>();
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Academia(String nome) {
        this.nome = nome;
    }

    public Academia(String nome, ArrayList<Turma> turmas) {
        this.nome = nome;
        this.turmas = turmas;
    }

    public Academia(String nome, ArrayList<Turma> turmas, ArrayList<Professor> professores) {
        this.nome = nome;
        this.turmas = turmas;
        this.professores = professores;
    }

    public Academia(String nome, ArrayList<Turma> turmas, ArrayList<Professor> professores, ArrayList<Aluno> alunos) {
        this.nome = nome;
        this.turmas = turmas;
        this.professores = professores;
        this.alunos = alunos;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (!turmas.isEmpty())
            for (Turma turma : turmas) {
                System.out.println("Turma : " + turma.getNome());
                if (turma.getProfessor() != null){
                    System.out.println("Professor: " + turma.getProfessor().getNome() + " " + turma.getProfessor().getEspecialidade());
                } else{
                    System.out.println("Nenhum professor");
                }
                if (!turma.getAlunos().isEmpty()){
                    for (Aluno aluno : turma.getAlunos()) {
                        System.out.println(" - " + aluno.getNome() + " " + aluno.getIdade());
                    }
                } else {
                    System.out.println("Nenhum aluno matriculado");
                }
                System.out.println();
            }

    }

    /*public void imprime() {
        System.out.println(this.nome);
        for (Turma turma : turmas) {
            if (turma.getNome() != null){
                System.out.println("Turma: " + turma.getNome());
                if (turma.getProfessor() != null){
                    System.out.println("Professor: " + turma.getProfessor().getNome());
                    if (turma.getAlunos() != null && !turma.getAlunos().isEmpty()){
                        System.out.println("Alunos: ");
                        for (Aluno aluno : turma.getAlunos()) {
                            System.out.println(" - " + aluno.getNome());
                        }
                    } else {
                        System.out.println("Nenhum Aluno matriculado");
                    }
                } else {
                    System.out.println("Nenhum professor cadastrado");
                }
            }else {
                System.out.println("Não existe turma!");
            }
            System.out.println();
        }


    }*/

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}
