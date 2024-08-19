package Curso.jv.javacore.Jmodificadofinal.Teste;

import Curso.jv.javacore.Jmodificadofinal.Dominio.Carro;
import Curso.jv.javacore.Jmodificadofinal.Dominio.Comprador;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();
        carro.COMPRADOR.setNome("bmw");
        System.out.println(carro.COMPRADOR);

        System.out.println(Carro.VELOCIDADE_LIMITE);
    }
}
