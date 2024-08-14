package Curso.jv.javacore.Gassociacao.Teste;

import Curso.jv.javacore.Gassociacao.Dominio.Item;
import Curso.jv.javacore.Gassociacao.Dominio.Pedido;
import Curso.jv.javacore.Gassociacao.Dominio.Produto;

public class PedidoTeste01 {
    public static void main(String[] args) {
        Produto Arroz = new Produto("Arroz", 10);
        Produto Feijao= new Produto("Feijao", 7.5);
        Produto Batata = new Produto("Batata", 4.25);
        Produto Carne = new Produto("Carne", 33.5);
        Item iten = new Item(3, Arroz);
        Item iten1 = new Item(2, Feijao);
        Item iten2 = new Item(3, Batata);
        Item iten3 = new Item(2, Carne);

        Item [] itens = new Item[]{iten1, iten3, iten2, iten};


        Pedido pedido = new Pedido("2466", itens);
        pedido.imprime();
        pedido.calculaPrco();

    }
}
