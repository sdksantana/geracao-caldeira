package com.github.aula03.exercicio01;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
        private String nome;
        private String cpf;
        private int identificadorConta;
        private String banco;
        private String endereco;
        private double saldo;
        private LocalTime horarioAtual;
        private List<String> historico = new ArrayList<>();
        private boolean rotinamensal = false;
        private boolean contaativa = true;

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public void setIdentificadorConta(int identificadorConta) {
            this.identificadorConta = identificadorConta;
        }

        public void setBanco(String banco) {
            this.banco = banco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public void setHorarioAtual(LocalTime horarioAtual) {
            this.horarioAtual = horarioAtual;
        }

        public String getNome() {
            return nome;
        }

        public String getCpf() {
            return cpf;
        }

        public int getIdentificadorConta() {
            return identificadorConta;
        }

        public String getBanco() {
            return banco;
        }

        public String getEndereco() {
            return endereco;
        }

        public double getSaldo() {
            return saldo;
        }

        public LocalTime getHorarioAtual() {
            return horarioAtual;
        }
        public ContaBancaria(String nome, String cpf, int identificadorConta, String banco, String endereco, double saldo, LocalTime horas) {
            this.nome = nome;
            this.cpf = cpf;
            this.identificadorConta = identificadorConta;
            this.banco = banco;
            this.endereco = endereco;
            this.saldo = saldo;
            this.horarioAtual = horas;
        }
        public ContaBancaria() {
        }

        public void Deposita (double deposito)
        {
            this.saldo = this.saldo + deposito;
            this.historico.add("Depósito: R$ " + deposito);
        }

        public void Saca (double saque)
        {
            this.saldo = this.saldo - saque;
            this.historico.add("Saque: R$ " + saque);
        }
        public void ImprimeSaldo()
        {
            System.out.println("Saldo atual: " + saldo);
        }

        public void PixConta(double saque)
        {
            if (this.horarioAtual.getHour() >= 19 || this.horarioAtual.getHour() < 8)
            {
                System.out.println("Você não pode fazer uma transferência entre das 19h às 7h. Por favor, retorne às 8h da manhã.");
            } else if (this.saldo < saque)
            {
                System.out.println("Saldo insuficiente para transferência");
            } else
            {
                this.saldo = this.saldo - saque;
                this.historico.add("PIX: R$ " + saque);
            }

        }
        public void Transferencia(ContaBancaria destino, double valor)
        {
            if (this.horarioAtual.getHour() >= 19 || this.horarioAtual.getHour() < 8)
            {
                System.out.println("Você não pode fazer uma transferência entre das 19h às 7h. Por favor, retorne às 8h da manhã.");
            } else if (this.saldo < valor)
            {
                System.out.println("Saldo insuficiente para transferência");
            } else
            {
                this.saldo = this.saldo - valor;
                destino.saldo = destino.saldo + valor;
                this.historico.add("Tranferencia: R$ " + valor);
            }

        }
        public void VerHorario()
        {
            System.out.println("Horário atual: " + this.horarioAtual);
        }
        public void VerificarInformações()
        {
            System.out.println("Nome: " + this.nome);
            System.out.println("CPF: " + this.cpf);
            System.out.println("Endereço: " + this.endereco);
            System.out.println("Identificador: " + this.identificadorConta);
            System.out.println("Banco: " + this.banco);
            System.out.println("Saldo: " + this.getSaldo());
            System.out.println("Horário atual: " + this.horarioAtual);
        }
        public void ImprimeHistorico()
        {
            System.out.println("Histórico de Transações: ");
            System.out.println("-------------------------");
            for (String str : this.historico)
            {
                System.out.println(str);
            }
        }

    public void RotinaMensal()
    {
        if(LocalDate.now().getDayOfMonth() == 1)
        {
            if (this.rotinamensal == false)
            {
                this.saldo = this.saldo - 15; //taxa mensal
                this.saldo = this.saldo * 1.005; //juro mensal
                this.rotinamensal = true;
            }
        }
        if(LocalDate.now().getDayOfMonth() == 2)
        {
            if (this.rotinamensal == true)
            {
                rotinamensal = false;
            }
        }
    }

    public void FecharConta()
    {
        this.saldo = 0;
        this.contaativa = false;
    }
    }



