package ContaBancaria;
public class ContaBancaria {
    protected double saldo;
    protected int conta;

    public ContaBancaria(int conta, double saldo){
        this.conta = conta;
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de "+valor+" realizado. Saldo atual: "+ saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de "+ valor +" realizado! Saldo atual: "+ saldo );
        }else{
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: "+ saldo);
    }
}
