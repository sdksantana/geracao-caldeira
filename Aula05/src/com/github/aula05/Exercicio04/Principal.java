package com.github.aula05.Exercicio04;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Compra> compras = new ArrayList<Compra>();
        String nome;
        String dataValidade;
        int percorre = 1;

        do
        {
            System.out.println("Digite o nome do produto: ");
            nome = scanner.nextLine();
            System.out.println("Digite a data de validade do produto: ");
            dataValidade = scanner.nextLine();

            compras.add(new Compra(nome,dataValidade));

            System.out.println("Deseja continuar inserindo produtos? (1) Sim | (Outros valores) Não");
            percorre = scanner.nextInt();
            scanner.nextLine();
        }while (percorre == 1);

        for (Compra item : compras) {
            item.RetornaItens();
        }

        System.out.println("Deseja excluir algum produto? (1) Sim | (Outros valores) Não");
        int excluir = scanner.nextInt();

        if(excluir == 1){
            System.out.println("Digite o número do produto que deseja excluir:");
            for(int i=0; i<compras.size(); i++){
                System.out.println((i+1) + ". " + compras.get(i).getTitulo());
            }

            int indice = scanner.nextInt();
            if(indice > 0 && indice <= compras.size()){
                compras.remove(indice-1);
                System.out.println("Produto excluído com sucesso!");
            } else {
                System.out.println("Número de produto inválido!");
            }
        }

        for (Compra item : compras) {
            item.RetornaItens();
        }
    }
}