package Curso.jv.javacore.BintroducaoMetodos.Teste;

import Curso.jv.javacore.BintroducaoMetodos.Dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        funcionario1.nome = "Adriel";
        funcionario1.idade = 24;
        //funcionario1.salario = new double [] {31341,313153,4342134};

        funcionario2.nome = "Sarah";
        funcionario2.idade = 28;
        funcionario2.salario = new double [] {32343,32546,484999,545};


        funcionario3.nome = "Casal";
        funcionario3.idade = 160;
        funcionario3.salario = new double[] {84848,454,8484};

        funcionario1.imprimeDados();
        funcionario2.imprimeDados();
        funcionario3.imprimeDados();

    }
}
