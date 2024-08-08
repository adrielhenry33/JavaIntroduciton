package Curso.jv.javacore.IntroducaoMetodos.Teste;

import Curso.jv.javacore.IntroducaoMetodos.Dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Adriel Henry Dias Barbosa");
        pessoa.setIdade(24);
        pessoa.imprimeDados();

    }
}
