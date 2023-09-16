package com.github.aula02;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat di = new DecimalFormat("0");//apenas uma casa para valores que precisam ser inteiros
        DecimalFormat dd = new DecimalFormat("0.00");//duas casas para valores que possam ser double
        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = scanner.nextInt();
        double calculo;
        int opcoes;

        do {
            System.out.println("Escolha uma das quatro operações: \n [1] - Adição \n [2] - Subtração \n [3] - Multiplicação \n [4] - Divisão \n [5] - Sair do Sistema");
            opcoes = scanner.nextInt();

            switch (opcoes) {
                case 1:
                    calculo = n1 + n2;
                    System.out.println("A adição dos números " + n1 + " e " + n2 + " é igual a: " + di.format(calculo));
                    break;
                case 2:
                    calculo = n1 - n2;
                    System.out.println("A subtração dos números " + n1 + " e " + n2 + " é igual a: " + di.format(calculo));
                    break;
                case 3:
                    calculo = n1 * n2;
                    System.out.println("A multiplicação dos números " + n1 + " e " + n2 + " é igual a: " + di.format(calculo));
                    break;
                case 4:
                    if (n2 != 0) {
                        calculo = Double.valueOf(n1)  / Double.valueOf(n2);
                        System.out.println("A divisão dos números " + n1 + " e " + n2 + " é igual a: " + dd.format(calculo));
                    }
                    break;
                case 5:
                    System.out.println("\nSaindo do sistema...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Aguarde por 3 segundos para retornar ao menu inicial automamticamente.\n");
                    try { //Faz o console retornar ao menu inicial após o usuário cair no default.
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }
        } while (opcoes < 1 || opcoes > 5); //repete até que o usuário coloque um número válido, caso contrário, cai no default

        scanner.close();
    }
}