package Curso.jv.javacore.Gassociacao.Dominio;

public class Pedido {
    private String codigo;
    private Item [] itens;

    public Pedido(String codigo, Item[] items) {
        this.codigo = codigo;
        this.itens = items;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Item[] getItems() {
        return itens;
    }

    public void setItems(Item[] items) {
        if (items == null){
            System.out.println("Itens invalidos ");
            return;
        }
        this.itens = items;
    }
    public void calculaPrco(){
        double preco =0;
        int quantidade = 0;
        for (Item item : itens){
            quantidade = item.getQuantidade();
            preco  = preco + (quantidade * item.getProduto().getPreco());
        }
        System.out.println("Preco total: " + preco);
    }
    public void imprime(){
        System.out.println("------------");
        System.out.println("Codigo do pedido: " + this.codigo);
        for (Item item: itens){
            System.out.print("Item: ");
            System.out.print(item.getProduto().getNome() + " ");
            System.out.print(" Quantidade: " + item.getQuantidade() + " ");
            System.out.println();
        }
    }
}
