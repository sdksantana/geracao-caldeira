package com.github.aula04.exercicio02;

public class Quadrado extends FormaGeometrica {
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    public double calcularArea() {
        System.out.println("Quadrado");
        return lado * lado;
    }
}
