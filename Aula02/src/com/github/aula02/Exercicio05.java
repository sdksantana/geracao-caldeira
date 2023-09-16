package com.github.aula02;
import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String str = scanner.nextLine();
        System.out.println("\nPrimeira metade: " + str.substring(0,str.length()/2));
    }
}
