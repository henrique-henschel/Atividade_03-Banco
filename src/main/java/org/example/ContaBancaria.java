package org.example;

// Criar uma classe abstrata `ContaBancaria`
public abstract class ContaBancaria {

    // Atributos: `numeroConta` (int), `titular` (String), `saldo` (double)
    private int numeroConta;
    private String titular;
    private double saldo;

    // Construtor que inicializa os atributos (instanciar com um saldo inicial DEFINIDO)
    public ContaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Construtor que inicializa os atributos (instanciar com saldo inicial igual a ZERO)
    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Getters
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Setter apenas para o saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Metodo `depositar(double valor)`, que aumenta o saldo
    public void depositar(double valor) {
        this.saldo += valor;
    }

    // Metodo abstrato `sacar(double valor)`, que sera implementado pelas subclasses
    public abstract void sacar(double valor);

    // Metodo `exibirInformacoes()`, que imprime os dados da conta
    public void exibirInformacoes() {
        System.out.println("INFORMAÇÕES DA CONTA:");
        System.out.println(">> Número da conta: " + this.getNumeroConta());
        System.out.println(">> Titular: " + this.getTitular());
        System.out.println(">> Saldo atual: " + this.getSaldo());
    }
}
