package com.github.aula06.exercicio03;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String check;
        TreeMap<Contato, String> agenda = new TreeMap<Contato, String>();
        agenda.put(new Contato("Humberto", "Avenida Uruguai, 89","Sul"), "519924689");
        agenda.put(new Contato("Fonseca", "Rua Ananab, 22","Norte"), "519999999");
        agenda.put(new Contato("Augusto", "Rua Portela, 99","Sul"), "518888888");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a Zona desejada:");
        check = scanner.nextLine();

        for (Contato item : agenda.keySet())
        {
            if (item.getZona().equals(check))
                System.out.println(item.getNome() + " | Zona " + item.getZona());
        }

    }
}
