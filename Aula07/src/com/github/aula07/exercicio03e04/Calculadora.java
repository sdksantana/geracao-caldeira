package com.github.aula07.exercicio03e04;
import com.github.aula07.exercicio03e04.Calculavel;

public class Calculadora  implements Calculavel {

    public int adicionar(int n1, int n2) {
        return n1 + n2;
    }

    public int subtrair(int n1, int n2) {
        return n1 - n2;
    }

    public int multiplicar(int n1, int n2) {
        return n1 * n2;
    }

    public double dividir(double n1, double n2) {
        if (n2 != 0 && n1 != 0) {
            return n1 / n2;
        } else {
            System.out.println("Não é possível dividir por 0");
            return 0;
        }
    }
}
