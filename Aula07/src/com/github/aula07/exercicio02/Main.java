package com.github.aula07.exercicio02;
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

        System.out.println("Que dia é hoje?");
        String diaHoje = scanner.nextLine().toUpperCase();//Converte as strings digitadas para letras maiusculas, evitando erro de verificação

        DiaDaSemana dia;
        try {
            dia = DiaDaSemana.valueOf(diaHoje);
        } catch (IllegalArgumentException e) {
            System.out.println("Inválido. Digite um dia existente.");
            return;
        }

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
        }
    }
}