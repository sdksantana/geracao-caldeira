package com.github.aula05.exercicio02;
import java.util.Scanner;
import java.util.Random;

public class ArrayValoresAleatorios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();//Blibioteca que imprime valores aleatórios
        boolean encontrado = false;
        int[] numeros = new int[10];
        int i = 0;
        for (i=0;i<10;i++) {
            numeros[i] = random.nextInt(100) + 1;//Nunca sorteia 0
        }

        System.out.println("Digite um número aleatório entre 1 a 100: ");
        int valorUsuario = scanner.nextInt();
        for (i=0;i<10;i++) {
            if (valorUsuario == numeros[i]) {
                encontrado = true;
            }
        }
        if (encontrado == true)
            System.out.println("Valor encontrado!");
        else
            System.out.println("Valor não encontrado.");
}
}
