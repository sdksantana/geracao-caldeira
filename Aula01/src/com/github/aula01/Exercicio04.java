package com.github.aula01;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Exercicio04 {
    public static void main(String[] args) {
        final double salarioMinimo;
        double salarioUsuario;
        boolean check;

        try (Scanner scanner = new Scanner(System.in)) {
            salarioMinimo = 1320.00;
            salarioUsuario = 0;
            check = false;

            while (check == false) {
                try {
                    System.out.println("Digite seu salário");
                    salarioUsuario = scanner.nextDouble();
                    check = true;
                } catch (InputMismatchException e) {
                    System.out.println("Valor inválido, digite apenas números.");
                    scanner.nextLine();
                }
            }
        }
        double quantidadeSalario = (salarioUsuario / salarioMinimo);
        DecimalFormat df = new DecimalFormat("#");
        System.out.println("Você recebe " + df.format(quantidadeSalario) + (" salários mínimos"));
        check = true;

    }
}