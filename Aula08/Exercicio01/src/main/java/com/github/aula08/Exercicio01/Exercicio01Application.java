package com.github.aula08.Exercicio01;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.Comparator;
@SpringBootApplication
public class Exercicio01Application {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Banana");
		lista.add("Limonada de Limão");
		lista.add("Serraria Serreiro");
		lista.add("Banana");
		long stringLista = lista.stream().count(); //Utilizando stream().count();. é possível calcular a quantidade de strings dentro da lista
		System.out.println("Número de strings na lista: " + stringLista);
		String stringProcurada = "Banana";
		long total = lista.stream().filter(s -> s.equals(stringProcurada)).count(); //filter(s -> s.equals(String).count verifica quantas vezes a string se repete na lista
		System.out.println("A string " + stringProcurada + " aparece " + total + " vezes na lista.");
		String maiorString = lista.stream().max(Comparator.comparingInt(String::length)).get(); // max(Comparator.comparingInt(String::length)).get() Verifica a maior string da lista
		System.out.println("Maior string:: " + maiorString);
	}

}
