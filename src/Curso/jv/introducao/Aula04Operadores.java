package Curso.jv.introducao;

public class Aula04Operadores {
    public static void main(String []args){
        // - + / *
        int numero1 = 10;
        int numero2 = 20;
        double resultado = (double) numero1 / (double) numero2;
        System.out.println(numero1+numero2);
        System.out.println(resultado);

        // %
        int resto  = 21%7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezmaiorQueVinte = 10>20;
        boolean isDezmenorQueVinte = 10<20;
        System.out.println(isDezmaiorQueVinte);
        System.out.println(isDezmenorQueVinte);


    }
}
