package Curso.jv.javacore.Gassociacao.Teste;

import Curso.jv.javacore.Gassociacao.Dominio.Pessoa;
import Curso.jv.javacore.Gassociacao.Dominio.Universidade;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Adriel", "29/01/2000");
        Pessoa pessoa1 = new Pessoa("Albert Einsten", "14/03/1879");
        Pessoa pessoa2 = new Pessoa("Isaac Newton", "04/01/1643");

        Universidade universidade = new Universidade("UFSC", "Perini");



        pessoa.setUniversidade(universidade);

        pessoa.imprime();
    }
}
