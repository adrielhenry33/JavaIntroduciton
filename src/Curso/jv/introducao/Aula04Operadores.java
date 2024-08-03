package Curso.jv.introducao;

public class Aula04Operadores {
    public static void main(String []args){
        // - + / * Operaradores aritmeticos
        int numero1 = 10;
        int numero2 = 20;
        double resultado = (double) numero1 / (double) numero2;
        System.out.println(numero1+numero2);
        System.out.println(resultado);

        // %
        int resto  = 21%7;
        System.out.println(resto);

        // < > <= >= == != Operadores relacionais
        boolean isDezmaiorQueVinte = 10>20;
        boolean isDezmenorQueVinte = 10<20;
        System.out.println(isDezmaiorQueVinte);
        System.out.println(isDezmenorQueVinte);

        //&& (AND) ||(OR) !(NOT) Operadores Logicos
        int age = 24;
        float payment = 2000;
        boolean isDentrodalei = age > 30 && payment > 4612;
        System.out.println(isDentrodalei);

        //  = += -= *= /= %= Operadores de atribuicao
        double bonus = 1800;

    }
}
