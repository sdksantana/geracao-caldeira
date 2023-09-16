package com.github.aula01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite três números");

        int n = scanner.nextInt();
        int maior = n;
        int menor = n;
        double soma = n;

        for (int i = 1; i < 3; i++) {
            n = scanner.nextInt();
            soma += n;
            if (n > maior)
                maior = n;
            if (n < menor)
                menor = n;
        }

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média: " + df.format(soma / 3));


    }
}
