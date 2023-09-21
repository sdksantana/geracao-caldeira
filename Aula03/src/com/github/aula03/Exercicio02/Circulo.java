package com.github.aula03.Exercicio02;
public class Circulo {
    private Double raio;
    private int x;
    private int y;
    private static final double PI = 3.14159;

    public double CalculaArea()
    {
        double area = PI * this.raio * this.raio;
        return area;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    public double CalcularCircuferencia()
    {
        double circuferencia = this.raio * 2 * PI;
        return circuferencia;
    }

    public void CalcularDiametro()
    {
        double diametro = this.raio * 2;
        System.out.println("O diametro é: " + diametro);
    }

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Circulo() {
    }

    public Double getRaio() {
        return raio;
    }

    public Circulo(Double raio, int x, int y) {
        this.raio = raio;
        this.x = x;
        this.y = y;
    }

    public void ImprimeCartesiano()
    {
        System.out.println("Valor do raio: " + raio + " | Coordenadas (" + x + "," + y + ")");
    }

    @Override
    public String toString() {
        return ("raio=" + this.raio + ", Circunferencia=" + CalcularCircuferencia() + ", area=" + CalculaArea());
    }
}
