package Curso.jv.javacore.FmodificadoresEstatico.Teste;

import Curso.jv.javacore.FmodificadoresEstatico.Dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(3223);

        Carro carro = new Carro("Porshe", 300);
        Carro carro1 = new Carro("Mercedes" , 320);
        Carro carro2 = new Carro("Lamborghini", 400);


        carro.imprime();
        carro1.imprime();
        carro2.imprime();

    }
}
