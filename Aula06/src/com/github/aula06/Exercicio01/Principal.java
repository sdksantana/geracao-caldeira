package com.github.aula06.Exercicio01;
import java.util.Stack;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Livro> pilhaDeLivros = new Stack<>();
        int opcoes;

        Livro livro01 = new Livro();
        livro01.setTitulo("O Pequeno Príncipe");
        livro01.setCategoria("Literatura Infantil");

        Livro livro02 = new Livro();
        livro02.setTitulo("Harry Potter e a Câmara Secreta");
        livro02.setCategoria("Fantasia, Romance");

        Livro livro03 = new Livro();
        livro03.setTitulo("Jurassic Park");
        livro03.setCategoria("Ficção Científica");

        Livro livro04 = new Livro();
        livro04.setTitulo("O Iluminado");
        livro04.setCategoria("Terror Psicológico");

        Livro livro05 = new Livro();
        livro05.setTitulo("Battle Royale");
        livro05.setCategoria("Suspense, Romance");

        pilhaDeLivros.push(livro01);
        pilhaDeLivros.push(livro02);
        pilhaDeLivros.push(livro03);
        pilhaDeLivros.push(livro04);
        pilhaDeLivros.push(livro05);

        do {
            System.out.println("O que você deseja fazer?: \n [1] - Imprimir os elementos da pilha \n [2] - Imprimir com base nas categorias \n [3] - Remover o primenro elemento do topo  \n [4] - Esvaziar lista de livros \n [5] - Sair do Sistema");
            opcoes = scanner.nextInt();

            switch (opcoes) {
                case 1:
                    for (Livro livro : pilhaDeLivros) {
                        System.out.println("Título: " + livro.getTitulo() + "\n" + "Categoria: " + livro.getCategoria() + "\n");
                    }
                    break;
                case 2:
                    for (Livro livro : pilhaDeLivros) {
                        System.out.println("Categoria: " + livro.getCategoria() + "\n");
                    }
                    break;
                case 3:
                    Livro elementoRemovido = pilhaDeLivros.pop();
                    System.out.println("Elemento removido: " + elementoRemovido);
                    System.out.println("Pilha de livros atualizada: " + pilhaDeLivros);
                    break;
                case 4:
                    while (!pilhaDeLivros.empty()) {
                        pilhaDeLivros.pop();
                    } System.out.println("A pilha de livros está vazia? " + pilhaDeLivros.empty());
                    break;
                case 5:
                    System.out.println("\nSaindo do sistema...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Aguarde por 3 segundos para retornar ao menu inicial automamticamente.\n");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }
        } while (opcoes < 1 || opcoes > 5);

        scanner.close();

    }
}