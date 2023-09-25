package com.github.aula01;
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = -1;
        do {
            System.out.println("Digite sua idade: ");
            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();
                if (idade < 0) {
                    System.out.println("Inválido. Digite um número positivo.\n");
                    scanner.next();
                    scanner.nextLine();
                }
            } else {
                System.out.println("Inválido. Digite apenas números.\n");
                scanner.next();
                scanner.nextLine();
            }
        } while (idade < 0);
        if (idade < 16) {
            System.out.println("Você tem " + idade + " anos. Você precisa ter no mínimo 16 anos para votar.");
        } else if (idade == 16 || idade == 17 || idade >= 65) {
            System.out.println("Você tem " + idade +  " anos, seu voto é opcional.");
        } else {
            System.out.println("Você tem " + idade + " anos. Seu voto é obrigatório!");
        }
    }
}
