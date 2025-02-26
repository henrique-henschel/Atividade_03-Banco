package org.example;

// So permite um saque gratuito por mes, os demais sao cobrados com taxa de R$ 5,00

public class ContaSalario extends ContaCorrente {

    private int quantidadeSaquesMes;  // Quantidades de saques feitas no mes
    private final double TAXA = 5.0;  // Constante para a taxa

    public ContaSalario(int numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo, limiteChequeEspecial);
        this.quantidadeSaquesMes = 0;  // Inicia sempre como ZERO ao instanciar
    }

    public ContaSalario(int numeroConta, String titular, double limiteChequeEspecial) {
        super(numeroConta, titular, limiteChequeEspecial);
        this.quantidadeSaquesMes = 0;  // Inicia sempre como ZERO ao instanciar
    }

    // Getter
    public int getQuantidadeSaquesMes() {
        return quantidadeSaquesMes;
    }

    // Setter
    public void setQuantidadeSaquesMes(int quantidadeSaquesMes) {
        this.quantidadeSaquesMes = quantidadeSaquesMes;
    }

    // Sobreescrevendo o metodo `sacar(double valor)` da superclasse
    @Override
    public void sacar(double valor) {
        if (this.getQuantidadeSaquesMes() == 0) {
            if (valor <= this.getSaldo() + this.getLimiteChequeEspecial()) {
                double novoSaldo = this.getSaldo() - valor;
                this.setSaldo(novoSaldo);
                this.setQuantidadeSaquesMes(getQuantidadeSaquesMes() + 1);
                System.out.println("Valor sacado: R$ " + valor);
            } else {
                System.out.println("ERRO! Valor inválido, pois excede o saldo e o limite atuais.");
            }
        } else {
            if (valor <= this.getSaldo() + this.getLimiteChequeEspecial()) {
                double novoSaldo = this.getSaldo() - (valor + TAXA);
                this.setSaldo(novoSaldo);
                this.setQuantidadeSaquesMes(getQuantidadeSaquesMes() + 1);
                System.out.println("Valor sacado: R$ " + valor);
            } else {
                System.out.println("ERRO! Valor inválido, pois excede o saldo e o limite atuais.");
            }
        }
    }
}
