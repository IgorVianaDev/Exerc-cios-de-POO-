package Exercicios.Exercicio2.dominio;

public class Biblioteca {
    private String sala;
    private Livro[] livros;
    private Leitor[] leitores;

    public Biblioteca(String sala) {
        this.sala = sala;
    }

    public Biblioteca(String sala, Livro[] livros) {
        this.sala = sala;
        this.livros = livros;
    }

    public Biblioteca(String sala, Livro[] livros, Leitor[] leitores) {
        this.sala = sala;
        this.livros = livros;
        this.leitores = leitores;
    }

    public void imprime() {
        System.out.println(this.sala);
        if (this.leitores != null) {
            for (Leitor leitor : leitores) {
                System.out.println("Leitor: " + leitor.getNome());
                if (leitor.getLivrosEmprestados() != null && leitor.getLivrosEmprestados().length > 0) {
                    for (Livro livrosEmprestado : leitor.getLivrosEmprestados()) {
                        System.out.println(" - " + livrosEmprestado.getTitulo());
                    }
                }else {
                    System.out.println("Nenhum livro emprestado.");
                }
                System.out.println();
            }

        } else {
            System.out.println("Nenhum Leitor.");
        }


    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public Leitor[] getLeitores() {
        return leitores;
    }

    public void setLeitores(Leitor[] leitores) {
        this.leitores = leitores;
    }
}
