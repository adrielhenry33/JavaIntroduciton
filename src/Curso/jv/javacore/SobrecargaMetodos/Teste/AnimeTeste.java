package Curso.jv.javacore.SobrecargaMetodos.Teste;

import Curso.jv.javacore.SobrecargaMetodos.Dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Shingeki no kyojin", "Tv" , 12);
        anime.init("Akuma drive" , "TV", 12, "Acao");
        anime.imprime();
    }
}
