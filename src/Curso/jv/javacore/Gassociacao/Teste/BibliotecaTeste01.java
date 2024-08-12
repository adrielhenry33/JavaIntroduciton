package Curso.jv.javacore.Gassociacao.Teste;

import Curso.jv.javacore.Gassociacao.Dominio.Biblioteca;
import Curso.jv.javacore.Gassociacao.Dominio.Livro;

public class BibliotecaTeste01 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca de Paris");
        Livro livro = new Livro("Percy Jackson", "Rick Riordan", biblioteca);
        Livro livro2 = new Livro("Senhor Dos Aneis", "J.R.R Token", biblioteca);
        Livro livro3 = new Livro("1984", "George Orwell", biblioteca);

        Livro [] livros = new Livro[] {livro, livro2, livro3};

        biblioteca.setLivros(livros);
        biblioteca.imprime();
    }
}
