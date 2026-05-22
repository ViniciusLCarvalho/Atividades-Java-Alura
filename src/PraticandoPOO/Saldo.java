package PraticandoPOO;

public class Saldo {
    double saldo;

    public Saldo(double saldo){
        this.saldo = saldo;
    }
    

    void zerarSaldo(){
        this.saldo = 0.0;
    }

    void exibirSaldo(){
        System.out.printf("Saldo atual: R$ %.2f%n", this.saldo);
    }
}
