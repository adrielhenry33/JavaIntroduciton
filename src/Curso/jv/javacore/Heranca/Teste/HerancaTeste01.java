package Curso.jv.javacore.Heranca.Teste;

import Curso.jv.javacore.Heranca.Dominio.Endereco;
import Curso.jv.javacore.Heranca.Dominio.Funcionario;
import Curso.jv.javacore.Heranca.Dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("3567-55");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Adriel");
        pessoa.setCpf("13098793627");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(23232);
        funcionario.setCpf("5545545");
        funcionario.setEndereco(endereco);
        funcionario.setNome("Andre");
        funcionario.imprime();
    }
}
