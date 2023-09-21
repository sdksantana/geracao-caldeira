package com.github.aula04.Exercicio02;

public class Losango extends FormaGeometrica {
    double diagonalMaior;
    double diagonalMenor;
    public double calcularArea() {
        return (diagonalMaior * diagonalMenor)/2;
    }
}
