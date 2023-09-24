package com.github.aula05.Exercicio06;
import com.github.aula05.Exercicio05.Impressao;

import java.util.Scanner;
import java.util.LinkedList;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Reserva> reservas = new LinkedList<Reserva>();
        int percorre = 1;

        do {
            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("\nDigite o local: ");
            String local = scanner.nextLine();

            System.out.println("\nDigite o seu CPF: ");
            String cpf = scanner.nextLine();

            reservas.addLast(new Reserva(nome, local, cpf));

            System.out.println("\nDesejas reservar mais alguma passagem? (1) Sim | (Outros valores) Não");
            percorre = scanner.nextInt();
            scanner.nextLine();


        } while (percorre == 1);

        System.out.println("\nDeseja cancelar alguma reserva? (1) Sim | (Outros valores) Não");
        int excluir = scanner.nextInt();

        if(excluir == 1){
            System.out.println("Digite o número da reserva que deseja excluir:");
            for(int i=0; i<reservas.size(); i++){
                System.out.println((i+1) + ". " + reservas.get(i).getLocal());
            }

            int indice = scanner.nextInt();
            if(indice > 0 && indice <= reservas.size()){
                reservas.remove(indice-1);
                System.out.println("Reserva cancelada com sucesso!\n");
            } else {
                System.out.println("Reserva inválida.");
            }
        }
            System.out.println("Lista de reservas:\n");
            for (Reserva item : reservas) {
                System.out.println("Nome: " + item.getNome());
                System.out.println("Local: " + item.getLocal());
                System.out.println("CPF: " + item.getCpf() + "\n");
            }
    }
    }
