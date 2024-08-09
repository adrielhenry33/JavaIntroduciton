package Curso.jv.javacore.Dconstrutores.Dominio;

public class Anime {
    private String nome;
    private String genero;
    private String tipo;
    private int episodios;
    private String estudio;

    public Anime(String nome, String genero, String tipo, int episodios ,String estudio){
        this(nome, genero, episodios);
        this.nome = nome;
        this.genero = genero;
        this.tipo = tipo;
        this.episodios = episodios;
        this.estudio = estudio;
    }

    public Anime(String nome, String genero, int episodios) {
        System.out.println("Dentro do construtor sem argumentos");

    }

    public void imprime(){
        System.out.println( this.nome );
        System.out.println( this.genero );
        System.out.println( this.tipo );
        System.out.println( this.episodios );
        System.out.println(this.estudio);
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
