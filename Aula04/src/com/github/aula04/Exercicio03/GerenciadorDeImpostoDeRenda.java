package com.github.aula04.Exercicio03;

public class GerenciadorDeImpostoDeRenda {

    public double totalTributos;

    public void adicionar(Tributavel t) {
        this.totalTributos += t.calculaTributos();
    }

    public double getTotalTributos() {
        return this.totalTributos;
    }
}

