package Curso.jv.javacore.Gassociacao.Teste;

import Curso.jv.javacore.Gassociacao.Dominio.Jogador;
import Curso.jv.javacore.Gassociacao.Dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Calleri");
        Time time = new Time("Sao Paulo");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
