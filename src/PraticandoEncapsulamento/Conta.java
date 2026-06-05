package PraticandoEncapsulamento;

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String t) {
        this.titular = t;
        this.saldo = 0;
    }

    void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor inválido.");
        }
    }

    void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    void exibirSaldo() {
        System.out.printf("Saldo atual de %s: %.2f", titular, saldo);
    }
}
