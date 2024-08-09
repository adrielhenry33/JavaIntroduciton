package Curso.jv.javacore.BintroducaoMetodos.Teste;

import Curso.jv.javacore.BintroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calc03 = new Calculadora();
        double resultado = calc03.divideDoisNumeros(50, 848);
        System.out.println(resultado);
    }
}
