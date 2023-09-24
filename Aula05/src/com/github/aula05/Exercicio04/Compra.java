package com.github.aula05.Exercicio04;
public class Compra {
    private String nome;
    private String dataValidade;


    public Compra (String nome, String dataValidade) {
        this.nome = nome;
        this.dataValidade = dataValidade;
    }

    public String getTitulo() {
        return nome;
    }

    public void setTitulo(String nome) {
        this.nome = nome;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void RetornaItens()
    {
        System.out.println("Produto: " + this.nome);
        System.out.println("Data de Vencimento: " + this.dataValidade);
        System.out.println("");
    }
}


