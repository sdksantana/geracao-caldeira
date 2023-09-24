package com.github.aula02;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Leônidas pede que você adivinhe quantos inimigos os seus soldados irão combater! Dê o seu palpite: ");
        int palpite = 0;
        boolean entradaValida = false;
        do {

            while (!entradaValida) {
                try {
                    palpite = scanner.nextInt();
                    entradaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Um pouco mais coerente!\n");
                    scanner.nextLine();
                }
            }

            if (palpite == 300000) {
                System.out.println("\nVocê acertou! Os soldados de Esparta enfrentarão 300mil homens!\n\"Espartanos, preparem o desjejum e comam com gosto! Pois, esta noite, jantaremos no inferno!\"" );

            } else if (palpite < 0) {
                System.out.println("Você está subestimando os soldados de Esparta? Muito mais!!\n");

            } else if (palpite < 300000) {
                System.out.println("Um pouco mais!\n");

            } else {
                System.out.println("Um pouco menos!\n");

            }
            entradaValida = false;

        } while (palpite != 300000);
    }
}
