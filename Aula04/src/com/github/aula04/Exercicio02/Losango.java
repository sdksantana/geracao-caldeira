package com.github.aula04.Exercicio02;
public class Losango extends FormaGeometrica {
    double diagonalMaior;
    double diagonalMenor;

    public Losango(double diagonalMaior, double diagonalMenor) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }
    public double calcularArea() {
        System.out.println("Losango");
        return (diagonalMaior * diagonalMenor)/2;
    }
}
