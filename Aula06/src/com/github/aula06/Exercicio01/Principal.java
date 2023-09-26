package com.github.aula06.Exercicio01;

import java.util.Stack;
public class Principal {
    public static void main(String[] args) {
        Stack<Livro> pilhas = new Stack<>();

        Livro livro01 = new Livro();
        livro01.setTitulo("O Pequeno Príncipe");
        livro01.setCategoria("Literatura Infantil");

        Livro livro02 = new Livro();
        livro02.setTitulo("Harry Potter e a Câmara Secreta");
        livro01.setCategoria("Romance, Fantasia");
    }
}