package Curso.jv.javacore.Gassociacao.Dominio;

public class Biblioteca {
    private String nome;
    private Livro [] livros ;

    public Biblioteca(String nome){
        this.nome = nome;
    }

    public Biblioteca(String nome, Livro[]livros){
        this.nome = nome;
        this.livros = livros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        if (livros == null){ return; }
        this.livros = livros;
        for (Livro livro : livros){
            livro.setBiblioteca(this);
        }
    }

    public void imprime(){
        System.out.println("Nome da biblioteca: " + this.nome);
        if (livros == null || livros.length == 0) {
            System.out.println("Nenhum livro disponivel");
            return;
        }
        System.out.println("Livros disponiveis: ");
        for (Livro livro : livros){
            livro.imprime();
        }
        System.out.println("-------------");
    }
}
