package Curso.jv.javacore.IntroducaoMetodos.Dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public  void subtraiDoisNumeros() {
        System.out.println(20-123);
    }

    public void produtoDoisNumeros (int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros (double num1, double num2){
        return num1 / num2;
    }
}
