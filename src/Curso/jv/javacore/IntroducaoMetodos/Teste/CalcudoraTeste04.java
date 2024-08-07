package Curso.jv.javacore.IntroducaoMetodos.Teste;

import Curso.jv.javacore.IntroducaoMetodos.Dominio.Calculadora;

public class CalcudoraTeste04 {
    public static void main(String[] args) {
        Calculadora calc04 = new Calculadora();

        int num1 = 0;
        int num2 = 0  ;
        calc04.aleraDoisNumeros(num1, num2);
        System.out.println("Dentro da calculadora teste 04");
        System.out.println("Num1:" + num1);
        System.out.println("Num2:" + num2);

    }
}
