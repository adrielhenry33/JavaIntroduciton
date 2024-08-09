package Curso.jv.javacore.EblocosInicializacao.Teste;

import Curso.jv.javacore.EblocosInicializacao.Dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("one piece");
        for (int episodiso: anime.getEpisodios()) {
            System.out.print(episodiso + " ");
        }
    }
}

