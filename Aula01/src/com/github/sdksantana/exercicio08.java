package com.github.sdksantana;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.IOException;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;

        do {
            System.out.println("Menu de opções:");
            System.out.println("1. Gestante");
            System.out.println("2. Idoso");
            System.out.println("3. PCD");
            System.out.println("4. Nenhuma das alternativas");
            System.out.print("\nDigite a sua opção: ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Você selecionou a Opção 1: ''Gestante'' \nSua fila é: preferencial.");
                    break;
                case 2:
                    System.out.println("Você selecionou a Opção 2: ''Idoso'' \nSua fila é: preferencial.");
                    break;
                case 3:
                    System.out.println("Você selecionou a Opção 3: ''PCD'' \nSua fila é: preferencial.");
                    break;
                case 4:
                    System.out.println("Você selecionou a Opção 4: ''Nenhuma das alternativas'' \nSua fila é: comum.");
                    break;
                default:
                    System.out.println("Opção inválida. Aguarde por 3 segundos para retornar ao menu inicial automamticamente.\n");
                    try { //Faz o console retornar ao menu inicial após o usuário cair no default.
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }
        } while (menu < 1 || menu > 4); //Verifica as opções que o usário digitou.

        scanner.close();
    }
}