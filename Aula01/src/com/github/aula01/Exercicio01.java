package com.github.aula01;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner textoDigitado = new Scanner(System.in);
            System.out.println("Digite o seu nome: ");
        String seuNome = textoDigitado.nextLine();
            System.out.println("Seu nome é: " + seuNome);
    }
}