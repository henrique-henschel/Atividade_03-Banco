package org.example;

// Taxa de retirada e de 5%, e o saldo mínimo exigido para saque e R$ 10.000,00

public class ContaInvestimentoAltoRisco extends ContaInvestimento {

    // Constantes que representam as regras de negocio
    private final double TAXA_RETIRADA = 0.05;
    private final double SALDO_MINIMO_EXIGIDO = 10000.0;

    public ContaInvestimentoAltoRisco(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    public ContaInvestimentoAltoRisco(int numeroConta, String titular) {
        super(numeroConta, titular);
    }

    // Sobreescrevendo o metodo `sacar(double valor)` da superclasse
    @Override
    public void sacar(double valor) {
        if (this.getSaldo() >= SALDO_MINIMO_EXIGIDO) {
            double novoSaldo = this.getSaldo() - ((1.0 + this.TAXA_RETIRADA) * valor);
            this.setSaldo(novoSaldo);
            System.out.println("Valor sacado: R$ " + valor);
        } else {
            System.out.println("ERRO! O saldo atual é menor que o mínimo exigido para permitir saques.");
        }
    }
}
