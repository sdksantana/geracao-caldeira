package com.github.aula01;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
            int numeroUm = scanner.nextInt();
        System.out.println("Digite outro número: ");
            int numeroDois = scanner.nextInt();
                 System.out.println("Números digitados: " + numeroUm + " e " + numeroDois);
    }
}
