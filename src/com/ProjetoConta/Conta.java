package com.ProjetoConta;

public class Conta {

    private String conta;

    private String agencia;

    private double saldo;

    private String nomeCliente;

    private int sacar() {
        return 1;
    }

    private double depositar() {
        return 0;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo() {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        return "Dados da conta " + "\n" +
                "conta = " + conta + "\n" +
                "agencia = " + agencia + "\n" +
                "saldo =" + saldo + "\n" +
                "nomeCliente = " + nomeCliente + "\n";
    }

    public int calcularValor(double valor) {
        if (valor > 1) ;


        return 0;
    }

}