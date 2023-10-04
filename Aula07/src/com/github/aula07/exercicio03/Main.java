package com.github.aula07.exercicio03;
import java.util.Scanner;

public class Main implements calculavel {
    @Override
    public void multiplicar() {

    }
    @Override
    public void somar() {

    }
    @Override
    public void subtrair() {

    }
    @Override
    public void dividir() {

    }
    public enum Operacoes {
        MULTIPLICAR,
        SUBTRAIR,
        DIVIDIR,
        SOMAR
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = false;
        System.out.println("Digite um valor inteiro aleatório");
        Operacoes opcoes;
        opcoes = Operacoes.valueOf();

        do {
            try {
                int numero = scanner.nextInt();
                if (numero < 0) {
                    System.out.println("Digite um valor positivo.");
                } else {
                    System.out.println("Você digitou o número: " + numero);
                    entradaValida = true;
                }
            } catch (Exception e) {
                System.out.println("Digite um valor válido!");
                scanner.next();
            }

        } while (!entradaValida);
    }

    switch (opcoes) {
        case MULTIPLICAR:
            System.out.println("Hoje é Segunda-feira.");
            break;
        default:
            System.out.println("Inválido. Digite um dia existente.");
    }
}


