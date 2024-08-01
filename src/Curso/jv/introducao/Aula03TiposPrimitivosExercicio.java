package Curso.jv.introducao;

/* Pratica

Crie variaveis para os campos descritos abaixo entre <> e imprima
a seguinte mensagem:

Eu <name> morando no endereco <endereco>, confirmo que recebi o salario
de <salario>, na data <data>
* */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Adriel Henry Dias Barbosa";
        String address = "Rua Samuel Helsy 163";
        float payment = 2132.5f;
        String DataPayment = "30/08/2024";

        System.out.println("Eu " + name + " morando no endereco " + address + ", confirmo " +
                "que recebi o salario de " + payment + ", na data " + DataPayment +".");
    }
}
