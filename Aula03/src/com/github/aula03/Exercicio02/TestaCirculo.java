package com.github.aula03.Exercicio02;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TestaCirculo {
    public static void  main (String[]args){
        Scanner scanner = new Scanner(System.in);
        Circulo circulo1 = new Circulo();
        double raio;
        double circoferencia;
        double area;
        int coordx;
        int coordy;

        DefinirRaio(circulo1);
        circoferencia = circulo1.CalcularCircuferencia();
        area = circulo1.CalculaArea();
        System.out.println(circulo1);

        System.out.println("Digite o raio do segundo círculo: ");
        raio = scanner.nextDouble();
        Circulo circulo2 = new Circulo(raio);
        System.out.println(circulo2);

        ComparaCirculos(circulo1, circulo2);
        circulo1.CalcularDiametro();
        AreaSombreada(circulo1,circulo2);

        System.out.println("Digite a coordenada X");
        coordx = scanner.nextInt();
        System.out.println("Digite a coordenada Y");
        coordy = scanner.nextInt();
        System.out.println("Digite o raio do circulo no plano cartesiano: ");
        raio = scanner.nextDouble();

        Circulo circuloCartesiano = new Circulo(raio, coordx, coordy);
        circuloCartesiano.ImprimeCartesiano();

    }

    static void DefinirRaio(Circulo circulo)
    {
        Scanner scanner = new Scanner(System.in);
        double raio = 0;
        System.out.println("Digite o novo raio");
        boolean entradaValida = false;
            while (!entradaValida)
            {
                try {
                    raio = scanner.nextDouble();
                    if (raio < 0)
                        System.out.println("Digite um valor positivo");
                    else
                        entradaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Digite um valor mumérico.\n");
                    scanner.nextLine();
                }
            }

        circulo.setRaio(raio);
    }

    static void ComparaCirculos(Circulo circ1, Circulo circ2)
    {
        if (circ1.getRaio() == circ2.getRaio())
        {
            System.out.println("São iguais");
        }
        else
        {
            System.out.println("São diferentes");
        }
    }

    static void AreaSombreada(Circulo circ1, Circulo circ2)
    {
        double area1 = circ1.CalculaArea();
        double area2 = circ2.CalculaArea();

        if (area1 > area2)
            System.out.println("A área sombreada é: " + (area1 - area2));
        else
            System.out.println("A área sombreada é: " + (area2 - area1));
    }
}
