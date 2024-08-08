package Curso.jv.javacore.IntroducaoMetodos.Dominio;

public class Funcionario {
    // Crie uma classe Funcionario com os seguintes atributos

    /*
    nome
    idade
    salario

    Crie dois metodos
    1. Para imprimir os dados
    2. Para tirar a media dos salarios e imprimir o resultado
    * */

    public String nome;
    public int idade;
    public double [] salario;


    public void imprimeDados(){
        System.out.println("Dados do funcionario");
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (salario == null){
            System.out.println("Salarios invalidos ");
            System.out.println("------------------");
            return;
        }

        for (double valores : this.salario) {
            System.out.println(valores);
        }
        mediaSalario();
        System.out.println("------------------");
    }

    private void mediaSalario(){
        if (this.salario == null){
            System.out.println("Salario invalido ou nao inserido");
            return;
        }
        double media = 0;

        for (double valores : this.salario) {
            media += valores;
        }
        media/=this.salario.length;
        System.out.println("A media salaria e: " + media);

    }

}
