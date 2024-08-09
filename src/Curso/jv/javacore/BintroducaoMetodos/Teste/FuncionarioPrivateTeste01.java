package Curso.jv.javacore.BintroducaoMetodos.Teste;

import Curso.jv.javacore.BintroducaoMetodos.Dominio.FuncionarioPrivate;

public class FuncionarioPrivateTeste01 {
    public static void main(String[] args) {
        FuncionarioPrivate funcionario = new FuncionarioPrivate();

        funcionario.setNome("Adriel Henry");
        funcionario.setIdade(24);
        funcionario.setSalarios(new double[]{564545,459659,69494});

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getIdade());
        for (double valores : funcionario.getSalarios()){
            System.out.println(valores);
        }
        System.out.println("media " + funcionario.getMedia());
    }
}
