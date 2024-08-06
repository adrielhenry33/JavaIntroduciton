package Curso.jv.javacore.IntroducaoClasses.teste;

import Curso.jv.javacore.IntroducaoClasses.dominio.Account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        Account account = new Account();

        System.out.println("Plase enter the name of accoutn: ");
        account.setName(input.nextLine());

        System.out.printf("The name of your account is : %s\n", account.getName());
    }
}
