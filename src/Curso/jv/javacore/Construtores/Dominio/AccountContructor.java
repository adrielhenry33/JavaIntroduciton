package Curso.jv.javacore.Construtores.Dominio;

public class AccountContructor {

    private String nome;
    private double balanco;

    public AccountContructor(String nome , double balanco){
        this.nome = nome;
        this.balanco = balanco;
    }

    public String getNome() {
        return nome;
    }

    public double getBalanco() {
        return balanco;
    }
}
