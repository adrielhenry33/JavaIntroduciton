package Curso.jv.javacore.CsobrecargaMetodos.Teste;

import Curso.jv.javacore.CsobrecargaMetodos.Dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akuma drive" , "TV", 12, "Acao");
        anime.imprime();
    }
}
