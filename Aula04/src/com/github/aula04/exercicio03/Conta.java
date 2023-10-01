package com.github.aula04.exercicio03;
public abstract class Conta {
    private String nome;
    private String cpf;
    private int identificadorConta;
    private String banco;
    private String endereco;
    protected double saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdentificadorConta() {
        return identificadorConta;
    }

    public void setIdentificadorConta(int identificadorConta) {
        this.identificadorConta = identificadorConta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(String nome, String cpf, int identificadorConta, String banco, String endereco, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta = identificadorConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = saldo;
    }
    public Conta() {
    }

    public void Deposita (double deposito)
    {
        this.saldo = this.saldo + deposito;
    }

    public void Saca (double saque)
    {
        this.saldo = this.saldo - saque;
    }
    public void ImprimeSaldo()
    {
        System.out.println("Saldo atual: " + saldo);
    }
}


