package PraticandoEncapsulamento;

public class PrincipalBanco {
    public static void main(String[] args) {
        Conta c = new Conta("Ana");

        c.depositar(1000);
        c.sacar(200);
        c.exibirSaldo();
    }
}
