package Curso.jv.javacore.Dconstrutores.Teste;

import Curso.jv.javacore.Dconstrutores.Dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "Tv", "Shonnen", 12, "Mapa");

        anime.imprime();
    }
}
