package com.github.sdksantana;

import java.util.Scanner;
public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n = scanner.nextInt();
        int cont = 1;
        int i;

        for (i=1;i<=n;i++)
        {
            cont = cont * i;
        }
        System.out.println("O fatorial de " + n + " é " + cont);
    }
}
