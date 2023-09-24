package com.github.aula04.Exercicio03;

public class ContaCorrente extends Conta implements Tributavel {
    double segurovida = 42;
    double taxa = 0.01;
    @Override
    public double calculaTributos() {
        return saldo * taxa + segurovida;//Retorna o valor do tributo e do seguro de vida
    }
}

