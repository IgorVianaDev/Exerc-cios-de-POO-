package Exercicios.Exercicio2.dominio;

public class Leitor {
     private String nome;
     private Livro[] livrosEmprestados;

    public Leitor(String nome) {
        this.nome = nome;
    }

    public Leitor(String nome, Livro[] livrosEmprestados) {
        this.nome = nome;
        this.livrosEmprestados = livrosEmprestados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro[] getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(Livro[] livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
}
