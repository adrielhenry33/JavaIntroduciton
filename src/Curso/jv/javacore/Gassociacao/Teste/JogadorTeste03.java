package Curso.jv.javacore.Gassociacao.Teste;

import Curso.jv.javacore.Gassociacao.Dominio.Jogador;
import Curso.jv.javacore.Gassociacao.Dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Calleri");
        Time time = new Time("Sao paulo");
        Jogador [] jogadores = {jogador} ;

        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--------Jogador-------");
        jogador.imprime();
        System.out.println("--------Time--------");
        time.imprime();
    }
}
