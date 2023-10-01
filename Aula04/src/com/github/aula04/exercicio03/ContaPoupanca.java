package com.github.aula04.exercicio03;
public class ContaPoupanca extends Conta implements tributavel {
    @Override
    public double calculaTributos() {
        return 0;
    }
}