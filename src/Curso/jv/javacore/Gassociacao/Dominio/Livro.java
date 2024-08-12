package Curso.jv.javacore.Gassociacao.Dominio;

public class Livro {
    private String titulo;
    private String autor;
    private Biblioteca biblioteca;

    public Livro(String titulo, String autor, Biblioteca biblioteca) {
        this.titulo = titulo;
        this.autor = autor;
        this.biblioteca = biblioteca;
    }

    public String  getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        if (titulo == null){ return; }
        this.titulo = titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor){
        if (autor == null) { return; }
        this.autor = autor;
    }

    public Biblioteca getBiblioteca(){
        return this.biblioteca;
    }
    public void setBiblioteca(Biblioteca biblioteca){
        if (biblioteca == null) { return; }
        this.biblioteca = biblioteca;
    }

    public void imprime(){
        if (titulo == null ){ return; }
        if (autor == null ) { return; }
        System.out.println("titulo do livro: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
