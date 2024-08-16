package Curso.jv.javacore.Heranca.Dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco estatico do funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicializacao de Funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicializacao de Funcionario 2");
    }
    public Funcionario(String nome){
        super(nome);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " recebi o salario de " + this.salario);
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }
}
