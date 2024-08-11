package Curso.jv.javacore.FmodificadoresEstatico.Teste;

import Curso.jv.javacore.FmodificadoresEstatico.Dominio.Contador;

public class ContadorTeste01 {
    public static void main(String[] args) {
        Contador contador1 = new Contador();
        Contador contador2 = new Contador();
        Contador contador3 = new Contador();
        System.out.println("Total instancias " + Contador.getTotalInstancias());

    }
}
