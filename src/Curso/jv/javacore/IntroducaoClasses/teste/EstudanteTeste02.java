package Curso.jv.javacore.IntroducaoClasses.teste;

import Curso.jv.javacore.IntroducaoClasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante2 = new Estudante();

        estudante2.nome = "Sarah Elen Souza Silva ";
        estudante2.idade = 28;
        estudante2.sexo = 'F';

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
