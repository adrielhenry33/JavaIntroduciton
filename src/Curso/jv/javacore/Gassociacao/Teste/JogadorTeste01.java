package Curso.jv.javacore.Gassociacao.Teste;

import Curso.jv.javacore.Gassociacao.Dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pele");
        Jogador jogador02 = new Jogador("Cristiano Ronaldo");
        Jogador jogador03 = new Jogador("Calleri");

        Jogador [] jogadores = new Jogador[]{jogador01, jogador02, jogador03};

        for(Jogador jogador : jogadores){
            jogador.imprime();
        }

    }
}
