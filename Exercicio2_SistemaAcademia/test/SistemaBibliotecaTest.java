package Exercicios.Exercicio2.test;

import Exercicios.Exercicio2.dominio.Autor;
import Exercicios.Exercicio2.dominio.Biblioteca;
import Exercicios.Exercicio2.dominio.Leitor;
import Exercicios.Exercicio2.dominio.Livro;

public class SistemaBibliotecaTest {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Sala 01");
        Autor autor = new Autor("Cs lewis");
        Leitor leitor1 = new Leitor("Igor");
        Leitor leitor2 = new Leitor("Cintia");
        Livro livro1 = new Livro("Cristianismo Puro e simples", autor);
        Livro livro2 = new Livro("Cartas de um diabo ao seu aprendiz", autor);
        Livro[] livros = {livro1, livro2};
        Leitor[] leitores = new Leitor[]{leitor1, leitor2};

        biblioteca.setLivros(livros);
        biblioteca.setLeitores(leitores);
        leitor1.setLivrosEmprestados(new Livro[]{livro1});
        leitor2.setLivrosEmprestados(new Livro[]{livro1, livro2});

        biblioteca.imprime();
    }
}
