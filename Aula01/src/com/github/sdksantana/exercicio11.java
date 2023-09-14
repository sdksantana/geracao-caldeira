package com.github.sdksantana;

import java.util.Scanner;
import java.text.Normalizer;
public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase aleatória: ");
        String frase = scanner.nextLine();
        String fraseSemAcentos = Normalizer.normalize(frase, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        int contador = 0;

        for (int i = 0; i < fraseSemAcentos.length(); i++) {
            char c = Character.toLowerCase(fraseSemAcentos.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("\nA frase contém: " + contador + " vogais.");
    }
}