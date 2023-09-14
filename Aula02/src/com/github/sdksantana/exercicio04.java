package com.github.sdksantana;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = scanner.nextInt();
        System.out.println("Escolha uma das quatro operações: \n [1] - Adição \n [2] - Subtração \n [3] - Multiplicação \n [4] - Divisão \n [5] - Sair do Sistema");
        int opcoes = scanner.nextInt();
        int calculo;

        if (opcoes == 1) {
            calculo = n1 + n2;
            System.out.println("A adição dos números " + n1 + " e " + n2 + " é igual a: " + calculo);
        } else if (opcoes == 2) {
            calculo = n1 - n2;
            System.out.println("A subtração dos números " + n1 + " e " + n2 + " é igual a: " + calculo);
        } else if (opcoes == 3) {
            calculo = n1 * n2;
            System.out.println("A multiplicação dos números " + n1 + " e " + n2 + " é igual a: " + calculo);
        } else if (opcoes == 4) {
            if (n2 != 0) {
                calculo = n1 / n2;
                System.out.println("A divisão dos números " + n1 + " e " + n2 + " é igual a: " + calculo);
            } else {
                System.out.println("Não é possível dividir por zero.");
            }
        } else if (opcoes == 5) {
            System.exit(0);
        } else {
            System.out.println("Valor desconhecido.");
        }
    }
}
