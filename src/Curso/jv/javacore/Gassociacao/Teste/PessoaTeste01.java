package Curso.jv.javacore.Gassociacao.Teste;

import Curso.jv.javacore.Gassociacao.Dominio.Pessoa;
import Curso.jv.javacore.Gassociacao.Dominio.Universidade;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Adriel", "29/01/2000");
        Universidade universidade = new Universidade("UFSC", "Perini");

        pessoa.setUniversidade(universidade);

        pessoa.imprime();
    }
}
