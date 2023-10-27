package com.github.aula07.exercicio06;

public class ContaBancaria {
    private double saldo;
    private double valor;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        this.valor = valor;
        System.out.println("Valor do saque: " + valor);
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para sacar.");
        } else {
            System.out.println("Transação Aprovada!");
        }
        saldo -= valor;
    }

    public void saldoHistorico() {
        System.out.println("Saldo atual: " + saldo);
    }

    public void saldoRestante() {
        System.out.println("Saldo restante: " + saldo);
    }

    public double getValor() {
        return valor;
    }
}
