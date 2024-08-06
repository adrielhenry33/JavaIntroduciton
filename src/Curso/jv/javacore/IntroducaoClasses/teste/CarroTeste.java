package Curso.jv.javacore.IntroducaoClasses.teste;

import Curso.jv.javacore.IntroducaoClasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro primeiroCarro = new Carro();
        Carro segundoCarro = new Carro();

        primeiroCarro.nome = "Ferrari";
        primeiroCarro.modelo = "TypeS";
        primeiroCarro.ano = 2003;

        segundoCarro.nome = "Lamborgini";
        segundoCarro.modelo = "Uracan";
        segundoCarro.ano = 2019;

        System.out.println("Nome do carro: " + primeiroCarro.nome);
        System.out.println("Modelo do carro: " + primeiroCarro.modelo);
        System.out.println("Ano do caro: " + primeiroCarro.ano);

        System.out.println("\n");

        System.out.println("Nome do carro: " + segundoCarro.nome);
        System.out.println("Modelo do carro: " + segundoCarro.modelo);
        System.out.println("Ano do caro: " + segundoCarro.ano);


    }
}
