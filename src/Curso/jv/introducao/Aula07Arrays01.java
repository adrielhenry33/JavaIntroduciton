package Curso.jv.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        // Sintaxe de uma array
        // tipo + [] + nome do array = new int [numero de casas do array]
        int [] idades = new int [3]; // o array e sempre inicializo com 0 quando nenhum valor e adicionado
        idades[0] = 21;
        idades[1] = 34;
        idades[2] = 12;

        for (int i = 0; i <= 2; i++)
            System.out.println(idades[i]);

    }
}
