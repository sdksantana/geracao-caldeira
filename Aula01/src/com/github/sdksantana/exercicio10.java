package com.github.sdksantana;

import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##");
        boolean entradaValida = false;
        int c = 0;

        while (!entradaValida) {
            System.out.println("Digite uma temperatura em Celsius: ");
            if (scanner.hasNextInt()) {
                c = scanner.nextInt();
                entradaValida = true;
            } else {
                System.out.println("Por favor, digite um número válido.\n");
                scanner.next();
            }
        }
        double f = (c * 9/5) + 32;
        System.out.println("\nA temperatura " + c + "°C" + " Celsius" + " convertida para Fahrenheit é de " + df.format(f) + "°F.");
    }
}