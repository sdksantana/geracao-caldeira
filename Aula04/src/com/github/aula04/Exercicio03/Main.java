package com.github.aula04.Exercicio03;
public class Main {
    public static void main(String[] args)
    {
        TestaTributavel();
    }
    static void TestaTributavel() {
        ContaCorrente contaNova = new ContaCorrente();
        contaNova.setSaldo(600);

        ContaPoupanca contaDois = new ContaPoupanca();
        contaDois.setSaldo(800);
        //contaDois.calculaTributos();//Teste para verificar os tributos de uma conta do tipo poupança.

        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
        gerenciador.adicionar(contaNova);
        gerenciador.adicionar(contaDois);

        System.out.println("Total de tributos: " + gerenciador.getTotalTributos());
    }

    }


