package Curso.jv.javacore.Gassociacao.Dominio;

public class Pessoa {
    private String  nome;
    private String  dataNascimento;
    private Universidade universidade;

    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Pessoa(String nome, String dataNascimento, Universidade universidade){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.universidade = universidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.dataNascimento);
        if (universidade == null) { return; }
        universidade.imprime();
    }
}
