package Curso.jv.javacore.Gassociacao.Dominio;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null){
            System.out.println("Nome do produto invalido");
            return;
        }
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0){
            System.out.println("Preco invalido");
            return;
        }
        this.preco = preco;
    }
}
