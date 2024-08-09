package Curso.jv.javacore.Construtores.Teste;

import Curso.jv.javacore.Construtores.Dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "Tv", "Shonnen", 12);

        anime.imprime();
    }
}
