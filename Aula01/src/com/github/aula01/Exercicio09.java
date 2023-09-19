package com.github.aula01;
import java.time.Year;
import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anoAtual = Year.now().getValue(); //Coleta o valor do ano atual, gerando um algoritmo atualizado automaticamente
        int anoUsuario = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("Digite seu ano de nascimento: ");
            if (scanner.hasNextInt()) {
                anoUsuario = scanner.nextInt();
                String anoUsuarioString = Integer.toString(anoUsuario); //converte int para string para limitar a 4 digitos
                if (anoUsuario > 0 && anoUsuario <= anoAtual && anoUsuarioString.length() == 4) { //Impede que o usuário digite um ano superior ao ano atual, que escreva caracteres além de números e que escreva menos ou mais que 4 digitos.
                    entradaValida = true;
                } else { //retorna false ao usuário digitar menos de 4 digitos e emite um alerta
                    System.out.println("Inválido. Digite seu ano de nascimento com 4 digitos.\n");
                }
            } else {
                System.out.println("Valor inválido. É permitido somente números com 4 dígitos.\n");
                scanner.next();
                scanner.nextLine();
            }
        }
        int idadeUsuario = anoAtual - anoUsuario;
        System.out.println("\nSua idade no ano de " + anoAtual + " é: " + idadeUsuario + " anos.");
    }
}