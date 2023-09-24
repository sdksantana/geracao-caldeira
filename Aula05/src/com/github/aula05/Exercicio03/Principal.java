package com.github.aula05.Exercicio03;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();
        String titulo;
        String descricao;
        String data;
        int percorre = 1;

        do
        {
            System.out.println("Digite o título da tarefa");
            titulo = scanner.nextLine();
            System.out.println("Digite o descrição da tarefa");
            descricao = scanner.nextLine();
            System.out.println("Digite o data da tarefa");
            data = scanner.nextLine();

            tarefas.add(new Tarefa(titulo,descricao,data));

            System.out.println("Deseja continuar inserindo tarefas? (1) Sim | (Outros valores) Não");
            percorre = scanner.nextInt();
            scanner.nextLine();
        }while (percorre == 1);

        for (Tarefa item : tarefas) {
            item.RetornaItens();
        }

        System.out.println("Deseja excluir uma tarefa? (1) Sim | (Outros valores) Não");
        int excluir = scanner.nextInt();

        if(excluir == 1){
            System.out.println("Digite o número da tarefa que deseja excluir:");
            for(int i=0; i<tarefas.size(); i++){
                System.out.println((i+1) + ". " + tarefas.get(i).getTitulo());
            }

            int indice = scanner.nextInt();
            if(indice > 0 && indice <= tarefas.size()){
                tarefas.remove(indice-1);
                System.out.println("Tarefa excluída com sucesso!");
            } else {
                System.out.println("Número de tarefa inválido!");
            }
        }

        for (Tarefa item : tarefas) {
            item.RetornaItens();
        }
    }
}