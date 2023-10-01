package com.github.aula03.exercicio01;
import java.time.LocalTime;
import java.util.Scanner;

public class ContaPrincipal {
    public static void main(String[] args) {
        //Definicao
        Scanner scanner = new Scanner(System.in);
        ContaBancaria novaConta = CriaContaManual();
        /*novaConta.setNome("Pedro");
        novaConta.setCpf("");
        novaConta.setIdentificadorConta(555);
        novaConta.setBanco("Agi");
        novaConta.setEndereco("Maria do Bairro, 339");
        novaConta.setSaldo(0);
        novaConta.setHorarioAtual(LocalTime.of(15,0));*/

        ContaBancaria contaDestino = new ContaBancaria();
        contaDestino.setSaldo(0);

        //Execucao
        novaConta.VerificarInformações();

        System.out.println("Digite um cpf");
        String cpf = scanner.nextLine();

        if(VerificaCpf(cpf))
        {
            System.out.println("Valido");
        }
        else
        {
            System.out.println("Invalido");
        }

    }

    static boolean VerificaCpf (String cpfvalida)
    {
        if (cpfvalida.length() != 11)
        {
            return false;
        }

        try
        {
            Integer.parseInt(cpfvalida);
            return true;
        }
        catch (NumberFormatException nfe)
        {
            return false;
        }
    }

    static void AlteraEndereco (ContaBancaria conta)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um endereço");
        String endereco = scanner.nextLine();
        conta.setEndereco(endereco);
    }

    static ContaBancaria CriaContaManual()
    {
        String nome;
        String endereco;
        String cpf;
        String banco;
        int idconta;
        double saldo;
        int hora;
        int minuto;
        LocalTime horario;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o nome do Proprietário da conta:");
        nome = scanner.nextLine();

        System.out.println("Digite o endereço do Proprietário da conta:");
        endereco = scanner.nextLine();

        System.out.println("Digite o CPF do Proprietário da conta:");
        cpf = scanner.nextLine();
        while(VerificaCpf(cpf) == false)
        {
            System.out.println("CPF invalido, tente novamente");
            cpf = scanner.nextLine();
        }

        System.out.println("Digite o Banco do Proprietário da conta:");
        banco = scanner.nextLine();

        System.out.println("Digite o Codigo da Conta:");
        idconta = scanner.nextInt();

        System.out.println("Digite o Saldo da Conta:");
        saldo = scanner.nextDouble();

        System.out.println("Digite a hora:");
        hora = scanner.nextInt();

        System.out.println("Digite os minutos:");
        minuto = scanner.nextInt();

        horario = LocalTime.of(hora,minuto);

        ContaBancaria conta = new ContaBancaria(nome, cpf, idconta, banco, endereco, saldo, horario);

        return conta;

    }
}
