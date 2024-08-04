package Curso.jv.introducao;

public class ExercicioAula05EstruturasCondicionais {
    public static void main(String[] args) {
        double salario = 632123.43;
        double imposto = salario;

        if (salario < 0){
            System.out.println("Salario Incorreto");
        } else if (salario >=0 && salario <= 34712.0) {
            imposto *= 9.7;
            imposto /= 100;
        } else if (salario >34712 && salario <=68507){
            imposto *= 37.35;
            imposto /= 100;
        } else {
            imposto *=49.5;
            imposto/=100;
        }
        System.out.println("O salario no valor de:" +salario+" tem o imposto de: "+imposto);
    }
}
