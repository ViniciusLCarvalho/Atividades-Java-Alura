package ContaBancaria;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public ContaCorrente(double saldo, int conta, double tarifaMensal){
        super(conta, saldo);
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de "+ tarifaMensal + " cobrada. Saldo atual: " + saldo);
        
    }
}
