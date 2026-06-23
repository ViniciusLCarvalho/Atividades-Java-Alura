package PraticandoHerancaPolimorfismoInterfaces;

public class PrincipalConta {
    public static void main(String[] args) {
        OperacaoBancaria deposito = new DepositoA(200);
        OperacaoBancaria saque = new SaqueA(50.5);

        deposito.executar();
        saque.executar();
    }
}
