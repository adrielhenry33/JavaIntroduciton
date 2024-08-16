package Curso.jv.javacore.Heranca.Teste;

import Curso.jv.javacore.Heranca.Dominio.Funcionario;

public class Heranca02 {
    //0 - Bloco de inicializacao estatico da super clase e executado quando o jvm carregar a classe filha.
    //1 - Bloco de inicializacao estatico da sub classe e executado quando a jvm carregar a clase filha.
    //2 - Alocado espaco em memoroia pro objeto da super classe pai.
    //3 - Cada atributo da super classe e criado e inicializado com valores default ou o que for passado passado da classe.
    //4 - Bloco de inicializacao da super classe e executado na ordem em que aparece.
    //5 - Construtor da super classe e executado.
    //6 - Blocos de inicializacao de funcionario sao executados
    //7 - Cada atributo da sub classe e criado e inicializado com valores default ou o que for passado  da classe.
    //8 - Bloco de inicializacao da subclasse e executado na ordem em que aparece.
    //9- Construtor e executado da subclasse.


    public static void main(String [] args){
        Funcionario funcionario = new Funcionario("Adriel");

    }
}
