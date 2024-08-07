package Curso.jv.javacore.IntroducaoMetodos.Teste;

import Curso.jv.javacore.IntroducaoMetodos.Dominio.Estudante;
import Curso.jv.javacore.IntroducaoMetodos.Dominio.ImprimeEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante.nome = "Midoriya";
        estudante.idade = 15;
        estudante.sexo = 'M';

        estudante02. idade = 17;
        estudante02.nome = "Sakura";
        estudante02.sexo = 'F';

        ImprimeEstudante dadosEstudante = new ImprimeEstudante();

        dadosEstudante.imprime(estudante);
        dadosEstudante.imprime(estudante02);
    }
}
