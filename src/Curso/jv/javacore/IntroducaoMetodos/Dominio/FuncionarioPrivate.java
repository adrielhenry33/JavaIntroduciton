package Curso.jv.javacore.IntroducaoMetodos.Dominio;

public class FuncionarioPrivate {

    private String nome;
    private int idade;
    private double [] salarios;
    private double media = 0;

    public void setNome(String nome){
        if (nome  == null){
            System.out.println("Nome invalido");
            return;
        }
        this.nome = nome;
    }

    public void setIdade(int idade){
        if (idade <= 0){
            System.out.println("Idade invalida");
            return;
        }
        this.idade = idade;
    }

    public void setSalarios (double ...salarios){
        if (salarios == null)
            return;
        this.salarios = salarios;
    }

    public double getMedia(){
        for (double valores : this.salarios){
            media += valores;
        }
        return media / this.salarios.length;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

}
