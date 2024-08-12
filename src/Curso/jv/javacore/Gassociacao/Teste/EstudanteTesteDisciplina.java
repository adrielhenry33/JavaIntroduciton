package Curso.jv.javacore.Gassociacao.Teste;

import Curso.jv.javacore.Gassociacao.Dominio.Disciplina;
import Curso.jv.javacore.Gassociacao.Dominio.Estudante;

public class EstudanteTesteDisciplina {
    public static void main(String[] args) {

        Estudante Adriel = new Estudante("Adriel", 17105438);
        Estudante Sarah = new Estudante("Sarah", 1589598);
        Estudante Ericles = new Estudante("Ericles", 1589458);

        Disciplina Fisica  = new Disciplina("Fisica", 5050);
        Disciplina Quimica  = new Disciplina("Quimica", 5549);
        Disciplina Algebra  = new Disciplina("Algebra", 5454);
        Disciplina Programacao = new Disciplina("Programacao", 5084);

        Estudante [] estudantes = new Estudante[] {Adriel, Ericles, Sarah};
        Disciplina [] disciplinas = {Fisica, Algebra, Quimica, Programacao};

        Fisica.setEstudante(estudantes);
        Quimica.setEstudante(estudantes);
        Algebra.setEstudante(estudantes);
        Programacao.setEstudante(estudantes);



        Adriel.imprime();
        Fisica.imprime();
    }
}
