package Curso.jv.javacore.IntroducaoMetodos.Dominio;

import jdk.internal.org.jline.utils.OSUtils;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome){
        if (nome == null){
            System.out.println("Nome invalido");
            return;
        }
        this.nome = nome;
    }

    public void setIdade(int idade){
        if (idade <= 0){
            System.out.println("Idade invalida ");
            return;
        }
        this.idade = idade;
    }

    public String getNome(){
        if (this.nome == null){
            return "Nome invalido";
        }
        return this.nome;
    }
    public int getIdade(){
        if (this.idade <=0){
            System.out.println("Idade invalida");
            return 0;
        }
        return this.idade;
    }
}
