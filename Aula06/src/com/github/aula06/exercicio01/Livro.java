package com.github.aula06.exercicio01;
public class Livro {
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    private String titulo;
    private String categoria;

    @Override
    public String toString() {
        return "Título - '" + titulo + "'";
    }
    }
