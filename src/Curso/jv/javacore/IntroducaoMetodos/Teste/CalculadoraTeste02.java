package Curso.jv.javacore.IntroducaoMetodos.Teste;

import Curso.jv.javacore.IntroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calc02 = new Calculadora();

        calc02.produtoDoisNumeros(20, 20);
        System.out.println(calc02.divideDoisNumeros(20,0));

    }
}
