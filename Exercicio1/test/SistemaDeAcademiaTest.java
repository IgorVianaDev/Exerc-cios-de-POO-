package Exercicios.Exercicio1.test;

import Exercicios.Exercicio1.dominio.Academia;
import Exercicios.Exercicio1.dominio.Aluno;
import Exercicios.Exercicio1.dominio.Professor;
import Exercicios.Exercicio1.dominio.Turma;

public class SistemaDeAcademiaTest {
    public static void main(String[] args) {
        Academia academia = new Academia("Ultrafitness");
        Turma turma1 = new Turma("Muay Thai");
        Turma turma2 = new Turma("Musculação");
        Professor professor1 = new Professor("Igor", "Artes Maciais");
        Professor professor2 = new Professor("Micael", "Educação Fisica");
        Aluno aluno1 = new Aluno("Larissa", 19);
        Aluno aluno2 = new Aluno("Cintia", 29);
        Aluno aluno3 = new Aluno("Leticia", 25);

        academia.getTurmas().add(turma1);
        academia.getTurmas().add(turma2);
        academia.getProfessores().add(professor1);
        academia.getProfessores().add(professor2);
        academia.getAlunos().add(aluno1);
        academia.getAlunos().add(aluno2);
        academia.getAlunos().add(aluno3);

        aluno1.setTurmaMatriculada(turma1);
        aluno2.setTurmaMatriculada(turma1);
        professor1.getTurmas().add(turma1);
        turma1.setProfessor(professor1);
        turma1.getAlunos().add(aluno1);
        turma1.getAlunos().add(aluno2);

        academia.imprime();

    }
}
