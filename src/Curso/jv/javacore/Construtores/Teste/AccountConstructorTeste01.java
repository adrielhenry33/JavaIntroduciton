package Curso.jv.javacore.Construtores.Teste;

import Curso.jv.javacore.Construtores.Dominio.AccountContructor;

public class AccountConstructorTeste01 {
    public static void main(String[] args) {
        AccountContructor Account = new AccountContructor("Adriel Henry", 50000);
        System.out.println(Account.getBalanco());
        System.out.println(Account.getNome());
    }
}
