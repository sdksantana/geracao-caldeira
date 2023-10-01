package com.github.aula06.exercicio04;
import java.util.LinkedHashMap;
import java.util.Map;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat dd = new DecimalFormat("0.00");
        LinkedHashMap<String, Double> produto = new LinkedHashMap<String, Double>();

        produto.put("Banana", 4.76);
        produto.put("Arroz", 3.59);
        produto.put("Alface", 2.90);
        produto.put("Goiaba", 5.70);
        produto.put("Morango", 15.90);

        int contador = 1;
        for (Map.Entry<String, Double> produtosEValores : produto.entrySet()) {
            String nomeDoProduto = produtosEValores.getKey();
            double valor = produtosEValores.getValue();
            System.out.println(contador + "º Produto: " + nomeDoProduto + ", R$ " + dd.format(valor));
            contador++;

        }
    }
}
