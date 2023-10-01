package com.github.aula04.exercicio02;
public class Retangulo extends FormaGeometrica {
    double base;
    double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea() {
        System.out.println("Retângulo");
        return base * altura;
    }
}
