package Curso.jv.javacore.Gassociacao.Dominio;

public class Universidade {
    private String nome;
    private String local;

    public Universidade(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    public void imprime (){
        System.out.print("Nome da Universidade: " + this.nome + " ");
        System.out.print("Local: " + this.local);
    }
}
