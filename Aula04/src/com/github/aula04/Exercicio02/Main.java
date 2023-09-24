package com.github.aula04.Exercicio02;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<FormaGeometrica> formas = new ArrayList<>();

        formas.add(new Triangulo(5,4));
        formas.add(new Quadrado(4));
        formas.add(new Circulo(1));
        formas.add(new Retangulo(5,6));
        formas.add(new Losango(4,5));

        for (FormaGeometrica forma : formas) {
            double area = forma.calcularArea();
            System.out.println("Área: " + area + "\n");

        }
    }
}

