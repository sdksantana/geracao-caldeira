package com.github.aula08;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		ArrayList<Produto> lista = new ArrayList();
		lista.add(new Produto("Chinelo", 25.0, 3));
		lista.add(new Produto("Camisa", 50.0, 4));
		lista.add(new Produto("Maçã", 2.0, 10));
		lista.add(new Produto("Laranja", 1.5, 15));
		lista.add(new Produto("Abacaxi", 5.0, 5));
		lista.add(new Produto("Banana", 2.0, 20));

		double maior = lista.stream().max(Comparator.comparingDouble(p -> p.getPreco())).get().getPreco(); // Imprime o valor mais alto do segundo elemento da lista
		System.out.println("O valor mais alto é: R$ " + maior);

		double total = lista.stream().mapToDouble(p -> p.getPreco()).sum(); // Soma todos os valores do segundo elemento da lista
		System.out.println("O preço de todos os produtos: R$ " + total);

		List<String> novaLista= lista.stream() // Nova lista
				.filter(p -> p.getQuantidade() > 10) // Filtra todos os elementos que possuam a quantidade superior a 10
				.map(p -> p.getNome() + ": quantidade - " + p.getQuantidade())
				.collect(Collectors.toList()); // Coleta os elementos da lista stream

				System.out.println("Nova lista com o terceiro elemento filtrado: " + novaLista);

			/* Imprime a lista
			for (Produto produto : lista) { // Imprime a lista
			produto.PrintProduto();

			} */

	}
}