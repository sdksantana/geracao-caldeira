package com.github.aula06.exercicio02;
import java.util.HashMap;
import java.util.Map;
public class Principal {
    public static void main(String[] args) {
        Map<String, Integer> nomesEIdades = new HashMap<String, Integer>();
        nomesEIdades.put("Marlon", 39);
        nomesEIdades.put("Olivia", 69);
        nomesEIdades.put("Augusto", 63);
        nomesEIdades.put("Enzo", 7);
        nomesEIdades.put("Valentina", 8);
        nomesEIdades.put("Gloria", 84);

        //System.out.println(nomesEIdades.get("Enzo"));//A idade do atributo "Enzo"

        //imprime todas as idades maiores que 60 anos
        for (Map.Entry<String, Integer> terceiraIdade : nomesEIdades.entrySet()) {
            String nome = terceiraIdade.getKey();
            int idade = terceiraIdade.getValue();
            if (terceiraIdade.getValue() >= 60)
                System.out.println("Terceira idade: " + nome + ", " + idade + " anos");

        }
    }
}
