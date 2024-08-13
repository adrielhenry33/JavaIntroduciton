package Curso.jv.javacore.Gassociacao.Dominio;

public class Item {
    private int quantidade;
    private Produto produto;

    public Item(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade < 0){
            System.out.println("Quantidade invalida");
            return;
        }
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {

        if (produto.getNome() == null || produto.getPreco() <= 0){
            System.out.println("Produto Invalido");
            return;
        }
        this.produto = produto;
    }
}
