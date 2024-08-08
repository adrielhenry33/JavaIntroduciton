package Curso.jv.javacore.IntroducaoMetodos.Dominio;

public class Calculadora {

    public  int numero1;
    public  int numero2;

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
        if (num2 != 0){
            return num1 / num2;
        }
        return 0;
    }

    public void aleraDoisNumeros (int num1, int num2){
        num1 = 99;
        num2 = 100;
    }
    public void somaArray(int [] numeros){
        int soma = 0;
        for(int valores: numeros){
            soma += valores;
            System.out.println(soma);
        }
    }

    public void somaVarArgs(int ...numeros){
        int soma = 0;
        for(int valores: numeros) {
            soma += valores;
            System.out.println(soma);
        }
    }
}
