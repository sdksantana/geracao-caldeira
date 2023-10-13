package com.github.aula07.exercicio02;
import java.text.Normalizer;
import java.util.Scanner;

public class Main {
    public enum DiaDaSemana {
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO,
        DOMINGO
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String diaHoje;
        boolean entradaValida = false;

        do {
            System.out.println("Que dia é hoje?");
            diaHoje = scanner.nextLine().toUpperCase();
            // Remove a acentuação da entrada
            diaHoje = Normalizer.normalize(diaHoje, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");

            try {
                DiaDaSemana dia = DiaDaSemana.valueOf(diaHoje);
                switch (dia) {
                    case SEGUNDA:
                        System.out.println("Hoje é Segunda-feira.");
                        break;
                    case TERCA:
                        System.out.println("Hoje é Terça-feira.");
                        break;
                    case QUARTA:
                        System.out.println("Hoje é Quarta-feira.");
                        break;
                    case QUINTA:
                        System.out.println("Hoje é Quinta-feira.");
                        break;
                    case SEXTA:
                        System.out.println("Hoje é Sexta-feira.");
                        break;
                    case SABADO:
                        System.out.println("Hoje é Sábado.");
                        break;
                    case DOMINGO:
                        System.out.println("Hoje é Domingo.");
                        break;
                    default:
                        System.out.println("Inválido. Digite um dia existente.");
                        break;
                }
                entradaValida = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Inválido. Digite um dia existente.\n");
            }
        } while (!entradaValida);
    }
}
