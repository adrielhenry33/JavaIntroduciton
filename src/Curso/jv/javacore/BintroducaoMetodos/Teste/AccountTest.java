package Curso.jv.javacore.BintroducaoMetodos.Teste;

import Curso.jv.javacore.BintroducaoMetodos.Dominio.Account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        Account account = new Account();

        System.out.println("Plase enter the name of account: ");
        String confereString = input.nextLine();
        account.setName(confereString);

        System.out.printf("The name of your account is : %s\n", account.getName());
    }
}
