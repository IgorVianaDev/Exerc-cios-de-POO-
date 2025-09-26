package Exercicios.Exercicio2.dominio;

public class Autor {
    private String nome;
    private Livro[] livrosEscritos;

    public Autor(String nome) {
        this.nome = nome;
    }

    public Autor(String nome, Livro[] livrosEscritos) {
        this.nome = nome;
        this.livrosEscritos = livrosEscritos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro[] getLivrosEscritos() {
        return livrosEscritos;
    }

    public void setLivrosEscritos(Livro[] livrosEscritos) {
        this.livrosEscritos = livrosEscritos;
    }
}
