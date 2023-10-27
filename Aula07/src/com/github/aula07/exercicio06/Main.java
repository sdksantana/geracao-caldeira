package com.github.aula07.exercicio06;

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0);
        conta.saldoHistorico();

        try {
            conta.sacar(1500.0);
            conta.saldoRestante();
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

    }
}
