package com.github.aula04.exercicio01;
public abstract class Veiculo {
    public String marca;
    public String modelo;
    public int ano;

    public double calcularCustoViagem (int distancia, String Veiculo) {
        if (Veiculo == "Carro" ){
            double custo =  0.20 * distancia;
            System.out.println("O custo da distância é: " + custo);
            return custo;
        } else {
            double custo = 0.15 * distancia;
            System.out.println("O custo da distância é: " + custo);
            return custo;
        }
    }
}






