package Curso.jv.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 5000;
        String mensagemDoar = "Vou fazer uma doacao";
        String mensagemNaoDoar = "Nao vou fazer uma doacao";
        String resultado;

        resultado = salario >= 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

    }
}
