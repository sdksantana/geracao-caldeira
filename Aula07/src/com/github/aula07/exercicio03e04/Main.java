package com.github.aula07.exercicio03e04;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora(); // Adiciona os métodos dentro da classe calculadora no Switch case abaixo

        int n1 = -1;
        int n2 = -1;
        boolean continuar = true;

        while (continuar) {
            if (n1 < 0) {
                while (n1 < 0) {
                    try {
                        System.out.println("Digite um valor inteiro: ");
                        n1 = scanner.nextInt();
                        if (n1 < 0) {
                            throw new IllegalArgumentException("Número negativo não é permitido.\n");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Erro: Entrada inválida. Por favor, insira um número inteiro positivo.\n");
                        scanner.next();
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }

            if (n2 < 0) {
                while (n2 < 0) { // Construí dois whiles para que evite que o usuário tenha que digitar o primeiro valor quando errar o segundo.
                    try {
                        System.out.println("Digite um segundo valor inteiro: ");
                        n2 = scanner.nextInt();
                        if (n2 < 0) {
                            throw new IllegalArgumentException("Número negativo não é permitido.\n");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Erro: Entrada inválida. Por favor, insira um número inteiro positivo.\n");
                        scanner.next();
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }

            // Menu de operações
            System.out.println("Escolha a operação desejada:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("\nResultado da adição: " + calculadora.adicionar(n1, n2));
                    break;
                case 2:
                    System.out.println("\nResultado da subtração: " + calculadora.subtrair(n1, n2));
                    break;
                case 3:
                    System.out.println("\nResultado da multiplicação: " + calculadora.multiplicar(n1, n2));
                    break;
                case 4:
                    double resultadoDivisao = calculadora.dividir(n1, n2);
                    DecimalFormat formato = new DecimalFormat("0.00");
                    String resultadoFormatado = formato.format(resultadoDivisao);
                    System.out.println("\nResultado da divisão: " + resultadoFormatado);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma operação válida.");
                    break;
            }

            System.out.println("Deseja fazer outra operação com os mesmos valores? (S para Sim, qualquer outra tecla para Sair): ");
            String escolhaContinuar = scanner.next(); // Permite que o usuário selecione outras operações novamente, ou saia do programa.
            if (escolhaContinuar.equalsIgnoreCase("S")) {
                continuar = true;
            } else {
                continuar = false;
                n1 = -1;
                n2 = -1;
            }
        }

        System.out.println("Programa encerrado.");
    }
}

