package com.github.aula05.exercicio01;
import java.util.Scanner;
public class ArraySomaEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira 5 números inteiros: ");
        int[] numeros = new int[5];
        int i = 0;
        int total = 5;
        int soma =  0;
        double media = 0;
        for (i=0;i<total;i++) {
            numeros [i] = scanner.nextInt();
        }
        for (i=0;i<total;i++) {
            soma = soma + numeros[i];
        }
        media = (double)soma/(double)total;

        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + media);
    }
}
