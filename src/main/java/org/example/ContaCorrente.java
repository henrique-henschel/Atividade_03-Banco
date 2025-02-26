package org.example;

// Possui um limite de cheque especial. Se o saldo for insuficiente, pode usar o cheque especial
// ate um limite predefinido.

public class ContaCorrente extends ContaBancaria {

    // Limite de cheque especial (obrigatorio passar como argumento ao instanciar a classe)
    private double limiteChequeEspecial;

    public ContaCorrente(int numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public ContaCorrente(int numeroConta, String titular, double limiteChequeEspecial) {
        super(numeroConta, titular);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    // Getter para o limite da conta
    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    // Implementando o metodo abstrato `sacar(double valor)`
    public void sacar(double valor) {
        if (valor <= this.getSaldo() + this.getLimiteChequeEspecial()) {
            double novoSaldo = this.getSaldo() - valor;
            this.setSaldo(novoSaldo);
            System.out.println("Valor sacado: R$ " + valor);
        } else {
            System.out.println("ERRO! Valor inválido, pois excede o saldo e o limite atuais.");
        }
    }
}
