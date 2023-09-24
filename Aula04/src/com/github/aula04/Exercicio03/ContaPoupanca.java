package com.github.aula04.Exercicio03;
public class ContaPoupanca extends Conta implements Tributavel {
    @Override
    public double calculaTributos() {
        return 0;
    }
}