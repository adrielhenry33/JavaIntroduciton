package Curso.jv.javacore.EblocosInicializacao.Dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    //1 - Alocado espaco em memroria pro objeto
    //2 - Cada atributo de classe e criado e inicializado com valores default ou o que for passado
    //3 - Bloco de inicializacao e executado
    //4 - O construtor e executado


    {
        episodios = new int [100];
        for (int i = 0; i < 99; i++) {
            this.episodios[i] = i+1;
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime (){

        for(int episodios : this.episodios){
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
