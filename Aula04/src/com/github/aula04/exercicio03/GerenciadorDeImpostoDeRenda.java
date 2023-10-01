package com.github.aula04.exercicio03;

public class GerenciadorDeImpostoDeRenda {

    public double totalTributos;

    public void adicionar(tributavel t) {
        this.totalTributos += t.calculaTributos();
    }

    public double getTotalTributos() {
        return this.totalTributos;
    }
}

