package com.github.aula04.exercicio02;
public class Circulo extends FormaGeometrica {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    public double calcularArea() {
        System.out.println("Circulo");
        return Math.PI * (raio * raio);
    }
}

