package com.github.aula02;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String str = scanner.nextLine();
        StringBuilder builder = new StringBuilder(str);
        System.out.println("\nReverso: " + builder.reverse());
    }
}

