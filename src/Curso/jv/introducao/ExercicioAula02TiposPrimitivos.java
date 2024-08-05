package Curso.jv.introducao;

import java.util.Scanner;

public class ExercicioAula02TiposPrimitivos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero1;
        int numero2;
        int soma;

        System.out.println("Informe o valor do primeiro numero: ");
        numero1 = input.nextInt();

        System.out.println("Informe o valor do segundo numero: ");
        numero2 = input.nextInt();

        soma = numero2 + numero1;
        System.out.println("O valor da soma e: " + soma);
        System.out.printf("Soma e: %d", soma);
    }
}
