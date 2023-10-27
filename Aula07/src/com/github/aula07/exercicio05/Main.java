package com.github.aula07.exercicio05;
import java.util.InputMismatchException;
import java.util.Scanner;

class IdadeInvalidaException extends RuntimeException {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = -1;

        while (idade <= 0 || idade >= 150) {
            try {
                System.out.println("Digite sua idade: ");
                idade = scanner.nextInt();
                if (idade <= 0 || idade >= 150) {
                    throw new IdadeInvalidaException("Idade inválida. Digite um valor inferior a 150, ou superior a 0\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um valor superior a 0 e positivo.\n");
                scanner.next();
            } catch (IdadeInvalidaException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Você tem " + idade + " anos");
    }
}
