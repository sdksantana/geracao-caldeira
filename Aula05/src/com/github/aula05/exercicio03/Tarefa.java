package com.github.aula05.exercicio03;
public class Tarefa {
    private String titulo;
    private String descricao;
    private String data;

    public Tarefa (String titulo, String descricao, String data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void RetornaItens()
    {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Descricao: " + this.descricao);
        System.out.println("Data: " + this.data);
        System.out.println("");
    }
}


