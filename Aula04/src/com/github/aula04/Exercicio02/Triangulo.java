package com.github.aula04.Exercicio02;

public class Triangulo extends FormaGeometrica {
    double base;
    double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        System.out.println("Triângulo");
        return base / altura;
    }
}
