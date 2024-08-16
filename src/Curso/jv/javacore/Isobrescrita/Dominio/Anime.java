package Curso.jv.javacore.Isobrescrita.Dominio;

public class Anime extends  Object{
    public String nome;

    @Override //// para ter certeza que estamos reescrevendo
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
