package Curso.jv.javacore.IntroducaoMetodos.Teste;

import Curso.jv.javacore.IntroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();


        System.out.println("Acabou o codigo");
    }
}
