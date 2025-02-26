package org.example;

// Aplica uma taxa de retirada de 2% sobre o valor sacado

public class ContaInvestimento extends ContaBancaria {

    // Constante para a taxa de retirada
    private final double TAXA_RETIRADA = 0.02;

    public ContaInvestimento(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    public ContaInvestimento(int numeroConta, String titular) {
        super(numeroConta, titular);
    }

    // Implementacao do metodo abstrato `sacar(double valor)`
    public void sacar(double valor) {
        double novoSaldo = this.getSaldo() - ((1.0 + TAXA_RETIRADA) * valor);
        this.setSaldo(novoSaldo);
        System.out.println("Valor sacado: R$ " + valor);
    }
}
