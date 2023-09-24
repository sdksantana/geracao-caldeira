package com.github.aula05.Exercicio05;
import java.util.Scanner;
import java.util.LinkedList;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Impressao> impressoes = new LinkedList<Impressao>();

        int percorre = 1;

        do
        {
            System.out.println("Digite o nome da impressão: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o número de páginas: ");
            String numeroDePaginas = scanner.nextLine();

            impressoes.addLast(new Impressao(nome,numeroDePaginas));

            System.out.println("Deseja adicionar mais documentos? (1) Sim | (Outros valores) Não");
            percorre = scanner.nextInt();
            scanner.nextLine();

        } while (percorre == 1);

        impressoes.removeFirst();

        for (Impressao item : impressoes) {
            System.out.println("Impressão: " + item.getNome());
            System.out.println("Páginas: " + item.getNumeroDePaginas() + "\n");
        }
    }
}
