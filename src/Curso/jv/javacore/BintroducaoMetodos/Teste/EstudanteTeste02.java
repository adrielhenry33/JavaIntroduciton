package Curso.jv.javacore.BintroducaoMetodos.Teste;

import Curso.jv.javacore.BintroducaoMetodos.Dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante  = new Estudante();
        Estudante estudante1 = new Estudante();

        estudante.nome = "Midoriya";
        estudante.idade = 15;
        estudante.sexo = 'M';

        estudante1.idade = 17;
        estudante1.nome = "Sakura";
        estudante1.sexo = 'F';

        estudante.imprime();
        estudante1.imprime();


    }
}
