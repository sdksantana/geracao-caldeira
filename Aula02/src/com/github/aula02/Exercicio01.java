package com.github.aula02;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor inicial");
        int valorInicial = scanner.nextInt();
        System.out.println("Digite um valor final");
        int valorFinal = scanner.nextInt();
        System.out.println("\nNumeros Primos:");
        int i=0;
        int j=0;
        int cont = 0;

        for (i = valorInicial; i <= valorFinal; i++) {
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cont += 1;
                }
            }
            if (cont == 2) {
                System.out.println(i);
            }
            cont = 0;
        }
    }
}
