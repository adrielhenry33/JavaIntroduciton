package Curso.jv.javacore.Gassociacao.Teste;

import Curso.jv.javacore.Gassociacao.Dominio.Escola;
import Curso.jv.javacore.Gassociacao.Dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Dev Dojo");
        Professor professor2 = new Professor("Adriel");
        Professor professor3 = new Professor("Sarah");

        Professor professor4 = new Professor("Jiraya");
        Professor professor5 = new Professor("kakashi");
        Professor professor6 = new Professor("Asuna");


        Escola escola = new Escola("Helena Prates", new Professor[]{professor1, professor2, professor3});
        Escola escola1 = new Escola("konoha", new Professor[]{professor4,professor5,professor6});
        escola.imprime();
        escola1.imprime();

    }
}
