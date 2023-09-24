package com.github.aula05.Exercicio05;

public class Impressao {
    private String nome;
    private String numeroDePaginas;

    public Impressao(String nome, String numeroDePaginas) {
        this.nome = nome;
        this.numeroDePaginas = numeroDePaginas;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(String numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
}
