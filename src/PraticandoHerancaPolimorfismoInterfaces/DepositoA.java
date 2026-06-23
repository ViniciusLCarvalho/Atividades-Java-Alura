package PraticandoHerancaPolimorfismoInterfaces;

public class DepositoA extends OperacaoBancaria {

    public DepositoA(double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.printf("Depósito de R$%.2f realizado\n", valor);
    }
}