package ContaBancaria;

import java.util.ArrayList;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta0 = new ContaBancaria(5000987, 500);
        ContaBancaria conta1 = new ContaBancaria(5000986, 600);
        ContaBancaria conta2 = new ContaBancaria(5000985, 700);
        ContaBancaria conta3 = new ContaBancaria(5000984, 800);
        ContaBancaria conta4 = new ContaBancaria(5000983, 900);
        ArrayList<ContaBancaria> listaContas = new ArrayList<>();

        listaContas.add(conta0);
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);
        listaContas.add(conta4);
        
        ContaBancaria contaMaiorSaldo = listaContas.get(0);
        for (ContaBancaria conta : listaContas) {
            if(conta.getSaldo() > contaMaiorSaldo.getSaldo()){
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com o maior saldo - Numero: "+contaMaiorSaldo.getConta()+
        ", saldo: "+ contaMaiorSaldo.getSaldo());
        
        // ContaCorrente contaCorrente = new ContaCorrente(500, 5000321, 0.50);
        // conta.depositar(500);
        // conta.consultarSaldo();
        // contaCorrente.depositar(500);
        // contaCorrente.cobrarTarifaMensal();
        // contaCorrente.consultarSaldo();
        // contaCorrente.sacar(150);
        // contaCorrente.consultarSaldo();
    }
}
