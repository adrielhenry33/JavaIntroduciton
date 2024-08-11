package Curso.jv.javacore.FmodificadoresEstatico.Dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    //0 - Bloca de inicializacao e executado quando o jvm carregar a classe
    //1 - Alocado espaco em memroria pro objeto
    //2 - Cada atributo de classe e criado e inicializado com valores default ou o que for passado
    //3 - Bloco de inicializacao e executado
    //4 - O construtor e executado

    static {
        System.out.println("Dentro do bloco de inicializacao static");
        Anime.episodios = new int [100];
        for (int i = 0; i < 99; i++) {
            Anime.episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Dentro do segundo bloco de inicializacao");
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime (){

        for(int episodios : Anime.episodios){
            System.out.print(episodios + " ");
        }
        System.out.println();
    }
    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
