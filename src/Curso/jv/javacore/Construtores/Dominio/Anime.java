package Curso.jv.javacore.Construtores.Dominio;

public class Anime {
    private String nome;
    private String genero;
    private String tipo;
    private int episodios;

    public Anime(String nome, String genero, String tipo, int episodios){
        this.nome = nome;
        this.genero = genero;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void imprime(){
        System.out.println( this.nome );
        System.out.println( this.genero );
        System.out.println( this.tipo );
        System.out.println( this.episodios );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
