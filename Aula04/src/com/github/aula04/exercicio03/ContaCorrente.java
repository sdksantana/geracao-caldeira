package com.github.aula04.exercicio03;

public class ContaCorrente extends Conta implements tributavel {
    double segurovida = 42;
    double taxa = 0.01;
    @Override
    public double calculaTributos() {
        return saldo * taxa + segurovida;//Retorna o valor do tributo e do seguro de vida
    }
}

