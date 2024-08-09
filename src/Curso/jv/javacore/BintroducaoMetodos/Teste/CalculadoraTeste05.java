package Curso.jv.javacore.BintroducaoMetodos.Teste;

import Curso.jv.javacore.BintroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calc05 = new Calculadora();
        int [] array = {1,2,3,4,5};

        calc05.somaArray(array);
        calc05.somaVarArgs(1,2,3,4,5,6,7);
    }
}
