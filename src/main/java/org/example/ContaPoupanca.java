package org.example;

// So permite saque se o saldo for suficiente (nao pode entrar no negativo)

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    public ContaPoupanca(int numeroConta, String titular) {
        super(numeroConta, titular);
    }

    // Implementacao do metodo abstrato `sacar(double valor)`
    public void sacar(double valor) {
        if (valor <= this.getSaldo()) {
            double novoSaldo = this.getSaldo() - valor;
            setSaldo(novoSaldo);
            System.out.println("Valor sacado: R$ " + valor);
        } else {
            System.out.println("ERRO! Valor inválido, pois excede o saldo atual.");
        }
    }
}
